package cykj.Utils;
import  cykj.bean.UserBean;
import  org.apache.ibatis.annotations.Param;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public  interface beanUtil {


    void createTable(@Param("tableName") String tableName);

    void add(UserBean userBean);

    void del(int id);

    void update(UserBean userBean);

    UserBean getUser(int id);

    UserBean[] list();

    class UploadServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    }
}
