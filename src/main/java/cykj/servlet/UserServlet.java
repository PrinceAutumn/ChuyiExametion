package cykj.servlet;

import cykj.service.UserService;
import cykj.service.UserServiceImpl;
import cykj.service.UserService;
import cykj.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userservlet")
public class UserServlet<IUserService, TblUser> extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {
        resp.setCharacterEncoding("utf-8");
        String path = req.getContextPath();
        PrintWriter pw= resp.getWriter();
        String action = req.getParameter("action")==null?"list":req.getParameter("action");
        System.out.println(action);
        UserService userService= new UserServiceImpl();
        //  IUserService userServices= (UserService)  UserService.getClassObject("com.soft.dao.UserServiceImpl");
        switch (action){
            case "del":
                String uid = req.getParameter("uid");
              //  boolean flag = UserService.delUser(uid);
            case "update":
                String userid = req.getParameter("uid");
                /*TblUser user= IUserService.findUserById(userid);
                System.out.println(user.getUname());
                req.setAttribute("USER",user);*/
                req.getRequestDispatcher("back/updateUser.jsp").forward(req,resp);
                break;
            case "save":
                //uid
                String uidss = req.getParameter("uid");
                String uname = req.getParameter("acc");
                String pwd = req.getParameter("pwd");
               /* TblUser u = new TblUser(uidss,uname,pwd);
                boolean flag2 =  IUserService.saveUser(u);*/
            /*    if(flag2){
                    pw.print(" <script type='text/javascript'>alert('修改成功!');location.href='"+path+"/userservlet';</script>");
                    pw.flush();
                }else{
                    pw.print(" <script type='text/javascript'>alert('修改失败!');location.href='"+path+"/userservlet';</script>");
                    pw.flush();
                }*/
                break;
            case "delall":
                // 取值
                String uids []=  req.getParameterValues("uid");
                for (String id: uids) {
                    System.out.println(id);
                }
                //
                break;
            case "list":
               // List<TblUser> userList= IUserService.findAllUser();
                //4. 存
               // req.setAttribute("USERLIST",userList);
                //5.转发
                req.getRequestDispatcher("back/userList2.jsp").forward(req,resp);
                break;
            case "reg":
                //4. 服务器收到数据
                //注册
                System.out.println("reg");
                String un = req.getParameter("uname");
                System.out.println(un);
                ///DAO
                // 5.返回响应客户端
                //if()
                // 发送一个实体类对象,   List   , String
                /*  Gson gson = new Gson();
                TblUser user2 = new TblUser("100","ccq","123");
                String userJson = gson.toJson(user2);*/
                //  pw.print(userJson);
                pw.flush();
                break;
        }

    }

}

