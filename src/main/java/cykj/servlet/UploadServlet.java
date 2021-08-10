package cykj.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cykj.service.LoginServiceImpl;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
/**
 * Servlet implementation class Utils.beanUtil.UploadServlet
 */
   @WebServlet("/Utils.beanUtil.UploadServlet")
public class UploadServlet<Exam, Question, filePath, pwd> extends HttpServlet {


    @Autowired
    private LoginServiceImpl LoginService;

    private static final long serialVersionUID = 1L;

    // 上传文件存储目录
    private static final String UPLOAD_DIRECTORY = "upload";

    // 上传配置
    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB
 
    private java.lang.Object Object;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("222");
        //Servlet中本来不能使用@Autowire注入bean，解决办法是在Servlet的init(ServletConfig)方法中调用
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    /**
     * 上传数据及保存文件
     */
       protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           request.setCharacterEncoding("UTF-8");
           response.setCharacterEncoding("UTF-8");
           PrintWriter out = response.getWriter();
           String pwd = request.getParameter("pwdText");
           String filePath;
           if (pwd.equals("123456")) {
               // 检测是否为多媒体上传
               if (!ServletFileUpload.isMultipartContent(request)) {
                   // 如果不是则停止
                   PrintWriter writer = response.getWriter();
                   writer.println("Error: 表单必须包含 enctype=multipart/form-data");
                   writer.flush();
                   return;
               }


               // 配置上传参数
               DiskFileItemFactory factory = new DiskFileItemFactory();
               // 设置内存临界值 - 超过后将产生临时文件并存储于临时目录中
               factory.setSizeThreshold(MEMORY_THRESHOLD);
               // 设置临时存储目录
               factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

               ServletFileUpload upload = new ServletFileUpload((FileItemFactory) factory);

               // 设置最大文件上传值
               upload.setFileSizeMax(MAX_FILE_SIZE);

               // 设置最大请求值 (包含文件和表单数据)
               upload.setSizeMax(MAX_REQUEST_SIZE);

               // 中文处理
               upload.setHeaderEncoding("UTF-8");

               // 构造临时路径来存储上传的文件
               // 这个路径相对当前应用的目录
               String uploadPath = request.getServletContext().getRealPath("./") + File.separator + UPLOAD_DIRECTORY;

               // 如果目录不存在则创建
               File uploadDir = new File(uploadPath);
               if (!uploadDir.exists()) {
                   uploadDir.mkdirs();


                   try {

                       // 解析请求的内容提取文件数据
                       @SuppressWarnings("unchecked")
                       List<FileItem> formItems = upload.parseRequest(request);

                       if (formItems != null && formItems.size() > 0) {
                           // 迭代表单数据
                           for (FileItem item : formItems) {
                               // 处理不在表单中的字段
                               if (!item.isFormField()) {
                                   String fileName = new File(item.getName()).getName();
                                   filePath = uploadPath + File.separator + fileName;
                                   File storeFile = new File(filePath);
                                   // 在控制台输出文件的上传路径
                                   System.out.println(filePath);
                                   // 保存文件到硬盘
                                   item.write(storeFile);
                                   request.setAttribute("message", "文件上传成功!");
                                   System.out.println("文件上传成功！");

//                                   String pwd = "123456";
//                                   boolean unpack = Unpack(filePath, pwd);
                                   boolean unpack = false;
                                   if (unpack) {
                                       System.out.println("解压成功！");

                                       String examPaperPath = "C:\\cykj\\Test\\ExamPaper.xls";
                                       String testPath = "C:\\cykj\\Test\\Test.xls";

                                   } else {
                                       System.out.println("解压失败！");
                                   }
                               }
                           }
                       }
                   } catch (FileUploadException e) {
                       e.printStackTrace();
                   } catch (Exception e) {
                       Throwable ex;
                       request.setAttribute("message", "错误信息: " + e.getMessage());
                       //                System.out.println(ex.getMessage());
                   }
                   // 跳转到 message.jsp
                   request.getRequestDispatcher("/jsp/TestManagement.jsp").forward(request, response);
               }
           }}
               }





