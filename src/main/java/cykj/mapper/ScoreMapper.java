package cykj.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ScoreMapper<Score> {
    ScoreMapper checkLogin(ScoreMapper ScoreMapper);

    int addScoreMapper(List<ScoreMapper> ScoreMapper);

    int insertALLScore(@Param("scoreList") List<Score> studentList);

    String getSTATEID(@Param("ENUMBER") String ENUMBER);




}
