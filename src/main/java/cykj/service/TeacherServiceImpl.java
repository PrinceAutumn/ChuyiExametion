package cykj.service;

import cykj.mapper.StudentMapper;
import cykj.mapper.TeacherMapper;
import cykj.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TeacherServiceImpl<Intent, IBinder> {
    @Autowired
    @Qualifier("teacherMapper")
    private TeacherMapper teacherMapper;


    public Object queryLogin(Object o) {
        return o;
    }
}

    


