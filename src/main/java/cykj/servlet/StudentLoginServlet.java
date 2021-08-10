package cykj.servlet;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet("/logins")
public class StudentLoginServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("1111111111111");
        //Servlet中本来不能使用@Autowire注入bean，解决办法是在Servlet的init(ServletConfig)方法中调用
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             super.doPost(req, resp);
        PrintWriter out = resp.getWriter();
        String acc = req.getParameter("acc");
        String pwd = req.getParameter("pwd");
        String code = req.getParameter("code");
        System.out.println(acc);
        System.out.println(pwd);
        System.out.println("您输入的验证码：" + code);

        HttpSession session = req.getSession();
        String codes = (String) session.getAttribute("authCode");
        System.out.println("session的验证码：" + codes);

//        if (code.equalsIgnoreCase(codes)) {
        Properties properties = new Properties();
        properties.load(StudentLoginServlet.class.getClassLoader().getResourceAsStream("config.properties"));
        String t_acc = properties.getProperty("t_acc");
        String t_pwd = properties.getProperty("t_pwd");
        String appra = properties.getProperty("appra");
        req.setAttribute("appra",appra);
        if (acc.equals(t_acc) && pwd.equals(t_pwd)) {
            out.write("1");
        } else {
            out.write("0");
        }
    }
}


