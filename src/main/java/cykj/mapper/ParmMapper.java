package cykj.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ParmMapper {
    ParmMapper checkLogin(ParmMapper ParmMapper);

    int addParmMapper(List<ParmMapper> ParmMapper);

    int selectlogin(@Param("UACCOUNT") String UACCOUNT, String UPWD);

    int insertALlStudent(@Param("Pname") String Pname);
}



