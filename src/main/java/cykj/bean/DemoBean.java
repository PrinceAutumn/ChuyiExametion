package cykj.bean;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoBean {
        public static void main(String[] args) throws BiffException, IOException {

        File path = new File("C:\\Users\\DELL\\Desktop\\Test\\Test.xls");
        //readExcel(path);
    }

        //excel 读取类
        private static String driver = "com.mysql.jdbc.Driver";
        private static String url = "jdbc:mysql://localhost:8080/chuanyitest";
        private static String user = "root";
        private static String password = "123456";
        private static Connection con = null;
        private static PreparedStatement pstatement=null;
        public  static <Workbook, Sheet> void readExcel(File path) throws BiffException, IOException{
            //连接数据库
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(con!=null) {
            System.out.println("sucess connect to mysql");
        }

                int rows = 0;
                for (int row = 2; row<rows; row++)  //z这里row从2开始是因为去除了表头占的两行
                {
                    String values[] = new String[3];
                    int cols = 0;
                    for(int col = 0; col<cols; col++)
                    {
                        // 将每行不同列的内容放入数组
                        // values[col] = sheet.getCell(col,row).getContents();
                    }
                    //将读取出来的内容写入mysql数据库
                    try {
                        pstatement = con.prepareStatement("insert test7 values(?,?,?);");
                        pstatement.setNString(1, values[0]);
                        pstatement.setNString(2,values[1]);
                        pstatement.setNString(3,values[2]);
                        pstatement.executeUpdate();  //执行sql语句插入内容
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

