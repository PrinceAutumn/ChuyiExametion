package cykj.mapper;


import cykj.bean.ExamBean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamMapper {
    ExamBean checkLogin(ExamBean ExamBean);

    int addExamBean(List<ExamBean> ExamBean);
}


