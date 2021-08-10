package cykj.Utils;


import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;
import java.io.IOException;


public class UnZip {
    public static boolean Unpack(String path, String pwd) {
        try {
            ZipFile zip = new ZipFile(path);
            zip.setFileNameCharset("GBK");
            //判断要解压的文件是否为压缩格式
            if (!zip.isValidZipFile()) {
                System.out.println("非法文件");
            }
            //解压密码
            if (zip.isEncrypted()) {
                zip.setPassword(pwd);
                //创建文件
                File file = new File("C:\\cykj");
                if (!file.exists()) {
                    file.mkdirs();
                }
                //写入绝对路径
                zip.extractAll(file.getAbsolutePath());
//                route = file.getAbsolutePath();
                return true;
            }
        } catch (ZipException e) {
//            e.printStackTrace();
            return false;
        }
        return false;
    }
}
