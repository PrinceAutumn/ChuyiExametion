package cykj.mapper;
import cykj.bean.StudentBean;
import cykj.bean.UserBean;
import cykj.bean.StudentBean;
import cykj.bean.UserBean;

import java.util.List;

 /**
  * Created by ml on June 2021/6/2.
  */
 //@Repository
    public interface UserMapper {

    List<StudentBean> checkLogin(StudentBean student);
    //根据id查询用户的信息
    public UserBean findUserById(int id)throws Exception;
    //根据用户名查看用户列表
    public List<UserBean> findUserByName(String username)throws Exception;
    //添加用户
    public void insertUser(UserBean user)throws Exception;
    //删除用户
    public void deleteUser(int id)throws Exception;
}


