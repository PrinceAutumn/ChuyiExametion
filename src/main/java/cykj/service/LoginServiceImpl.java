package cykj.service;/*



import cykj.bean.StudentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by ml on June 2021/6/2.
 */

import cykj.mapper.StudentMapper;
import cykj.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    @Qualifier("studentMapper")
    private StudentMapper studentMapper;

    @Override
    public Object queryLogin(Object o) {
        return o;
    }

 /*   @Override
    public StudentBean queryLogin(StudentBean o) {
          StudentBean studentBean1 = studentMapper
        return studentBean1;
    }*/

   /* @Override
    public StudentBean queryLogin(StudentBean studentBean) {
        System.out.println("11111111111111");
        StudentBean studentBean1 = studentMapper.checkLogin(studentBean);
        return studentBean1;
    }*/

}

