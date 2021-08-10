package cykj.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ManagementServlet  extends  HttpServlet {
               @Override
                    public void init() throws ServletException {
                    System.out.println("init初始化方法已经进来了--------");
              }
               @Override
                    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
                    HttpServletRequest reqs=(HttpServletRequest)req;
                    HttpServletResponse response=(HttpServletResponse)res;
                    //获取HTTP request请求方法
                    System.out.println("Service doget方法进来了--------");
                    String metod=reqs.getMethod();
                    if(metod.equals("GET")){

                    this.doGet(reqs,response);
            }else if(metod.equals("POST")){
                    this.doPost(reqs,response);
            }
        }

}

