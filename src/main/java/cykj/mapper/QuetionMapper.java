package cykj.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuetionMapper {
    QuetionMapper checkLogin(QuetionMapper QuetionMapper);

    int addQuetionMapper(List<QuetionMapper> QuetionMapper);
    int selectlogin(@Param("UACCOUNT") String UACCOUNT, String UPWD);

    int insertALlStudent(@Param("Pname") String Pname);
}
