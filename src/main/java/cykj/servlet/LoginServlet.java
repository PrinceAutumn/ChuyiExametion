package cykj.servlet;
import cykj.bean.StudentBean;
import cykj.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by ml on 2021/6/2.
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Autowired
    private LoginServiceImpl loginService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //Servlet中本来不能使用@Autowired注入bean，解决办法是在Servlet的init（ServletConfig）方法中调用
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
req.setCharacterEncoding("UTF-8");
resp.setCharacterEncoding("UTF-8");
        String account = req.getParameter("account");
        String pwd = req.getParameter("pwd");
        System.out.println(account);
        System.out.println(pwd);
        StudentBean tc = new StudentBean();
        tc.setAccount(account);
        tc.setPwd(pwd);
        StudentBean ts = (StudentBean) loginService.queryLogin(tc);
        if(ts!=null) {
//            out.write("1");
            req.getRequestDispatcher("jsp/examInfo.jsp").forward(req,resp);
        } else {
//            out.write("0");
            req.getRequestDispatcher("jsp/Test login system.jsp").forward(req,resp);
        }
    }
}
