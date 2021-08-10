package cykj.socket;


import com.alibaba.fastjson.JSONObject;
import cykj.bean.StudentBean;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;

import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.net.http.WebSocket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @ClassName: WebSocket
 * @Description:
 * @Author: MALIN
 * @Date: 2021/6/16
 */
@ServerEndpoint("/Websocket/{type}")//
public class Studentwebsocket<T_examServiceImpl, JsonBean> {
//    private ListBinding.EmptyProperty SpringUtil;
  //  @Autowired
//    private T_examServiceImpl t_examService = (T_examServiceImpl) SpringUtil.getBean("t_examServiceImpl");
//    //用来储存老师登录后websocket的准考证号和对应的session
    public static HashMap<String, Object> TEACHER_SESSION = new HashMap<String, Object>();
    //用来储存学生登录后websocket的准考证号和对应的session
    public static HashMap<String, Object> STUDENT_SESSION = new HashMap<String, Object>();
    private static volatile int onlineCount = 0;
    //用来存放每个客户端对应的WebSocketTest对象，适用于同时与多个客户端通信（线程安全的无序的集合）
    public static CopyOnWriteArraySet<WebSocket> webSocketSet = new CopyOnWriteArraySet<WebSocket>();
    //若要实现服务端与指定客户端通信的话，可以使用Map来存放，其中Key可以为用户标识（适用于并发）
    public static ConcurrentHashMap<Session, Object> webSocketMap = new ConcurrentHashMap<Session, Object>();
    //与某个客户端的连接会话，通过它实现定向推送(只推送给某个用户)
    private Session session;
    private Object JsonBean;

    // private JsonBean jsonBean;

    /**
     * 建立连接成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("type") String type) {

        System.out.println("连接成功");
        // 根据不同的前端获得不同的admin一遍区分老师和同学
        if (type.equals("teacher")) {
            System.out.println("老师登录连接上来了！");
            TEACHER_SESSION.put(type, session);
            for (String key : TEACHER_SESSION.keySet()) {
                Object value = TEACHER_SESSION.get(key);
                System.out.println("老师key=" + key + ",value=" + value);
            }
        } else {
            System.out.println("学生登录连接上来了！");
            STUDENT_SESSION.put(type, session);
            for (String key : STUDENT_SESSION.keySet()) {
                Object value = STUDENT_SESSION.get(key);
                System.out.println("学生key=" + key + ",value=" + value);
            }
        }
    //     session.getBasicRemote().sendText();
    }

     /**
      * 收到客户端调用的方法
      */
        @OnMessage
        public void onMessage(String message, Session mysession) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(message);
        System.out.println("jsonObject :" + jsonObject);
        System.out.println(jsonObject.get("type").toString());
        switch (jsonObject.get("type").toString()) {

            case "1":
                System.out.println("1：开始考试");
                  // 点击开始考试后将状态改为“考试中”
                  // 发送消息给老师的监考端
               session = (Session) TEACHER_SESSION.get("teacher");
//                // 放数据到bean中
                 StudentBean studentBean= new StudentBean();
                studentBean.getId("1");
                studentBean.examNumber("考试中");
//                // 用bean转成json对象
                Object jsonBean;
                JSONObject json = (JSONObject) JSONObject.toJSON(JsonBean);
//                // 用json对象转成json字符串发送过去
                session.getBasicRemote().sendText(json.toJSONString());

                // 给学生们发消息
                for (String key : STUDENT_SESSION.keySet()) {
                    // 拿到所有的已经登录的学生session
                    session = (Session) STUDENT_SESSION.get(key);
                    String value = null;
                    System.out.println("学生key=" + key + ",value=" + value);
//
                    // 用bean转成json对象
                     JSONObject json1 = (JSONObject) JSONObject.toJSON(JsonBean);
                    // 用json对象转成json字符串发送过去
                    session.getBasicRemote().sendText(json1.toJSONString());
                    System.out.println("学生们的jsonString" + json1.toJSONString());
                }

                break;
            case "2":
                System.out.println("2");
                break;

            case "7":
                System.out.println("7");
                String ENUMBER = jsonObject.get("message").toString();
                System.out.println("ttttttttt:" + ENUMBER);
                session = (Session) TEACHER_SESSION.get("teacher");

////                // 放数据到bean中
//                JsonBean jsonBean = new JsonBean();
//                jsonBean.setType("更改每个学生的状态");
//                jsonBean.setEnumber(ENUMBER);
//                jsonBean.setMessage("考试中");
     //           System.out.println("jsonBean:" + jsonBean);
                // 用bean转成json对象
                Object JsonBean = null;
                JSONObject json1 = (JSONObject) JSONObject.toJSON(JsonBean);
                // 用json对象转成json字符串发送过去
                session.getBasicRemote().sendText(json1.toJSONString());
               System.out.println("json1.toJSONString() :" + json1.toJSONString());



              System.out.println("8");
               // 拿到传过来的准考证号
               String ENUMBER1 = jsonObject.get("message").toString();
               session = (Session) TEACHER_SESSION.get("ENUMBER");
                System.out.println(session);

               // 发信息给客户端
               session.getBasicRemote().sendText("200");

                break;
        }
    }




    public void sendAllMessage(String message) throws IOException {
        // 发送信息
        this.session.getBasicRemote().sendText(message);

    }

    /**
     * 关闭连接调用的方法
     */

    public void onClose(Session closeSession) {
        webSocketMap.remove(session);
        webSocketSet.remove(this);
        subOnlineCount();
        System.out.println("有人离开，当前在线人数为：" + getOnlineCount());
    }


    // 获取在线人数
    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    // 添加在线人+1
    public static synchronized void addOnlineCount() {
        onlineCount++;
    }

    // 减少在线人-1
    public static synchronized void subOnlineCount() {
        onlineCount--;
    }

}