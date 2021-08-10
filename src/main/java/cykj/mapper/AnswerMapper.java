package cykj.mapper;


import cykj.bean.QuestionBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AnswerMapper<QuetionBean> {
    AnswerMapper checkLogin(AnswerMapper AnswerMapper);

    int addAnswerMapper(List<AnswerMapper> AnswerMapper);

    int insertAllQuestion(@Param("questionlist") List<QuetionBean> t_questionlist);

    List <QuestionBean> selectAllByExamId(@Param("ExamId") int examId);





}
