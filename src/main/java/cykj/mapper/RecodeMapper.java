package cykj.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RecodeMapper {
    RecodeMapper checkLogin(RecodeMapper RecodeMapper);

    int addRecodeMapper(List<RecodeMapper> RecodeMapper);
}

