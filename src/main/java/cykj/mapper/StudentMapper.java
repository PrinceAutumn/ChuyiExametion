package cykj.mapper;


import cykj.bean.StudentBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StudentMapper{
    StudentBean checkLogin(StudentBean studentBean);

    int addStudentbean(List<StudentBean> studentBean);

    int selectlogin(@Param("UACCOUNT") String UACCOUNT, @Param("UPWO") String a);

    List<StudentBean> selectStudentLogin(@Param("ANUMBER") String ANUMBER, @Param("IDCARD") String IDCARD);

//    int insertAll <student> selectALLstudent();

    List<StudentBean> selectstuscore();

    List<StudentBean> selectAlluser();

    int getUserId(int id);

//    int UpdateUser(Student student);

//    int UpdateUser(Student student);

    int DeleteUser(int id);

}
//List<Student>SelectUser(Map<string,Object> map);

