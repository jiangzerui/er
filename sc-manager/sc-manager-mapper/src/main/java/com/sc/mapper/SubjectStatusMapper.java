package com.sc.mapper;

import com.sc.pojo.SubjectStatus;
import com.sc.pojo.SubjectStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectStatusMapper {
    long countByExample(SubjectStatusExample example);

    int deleteByExample(SubjectStatusExample example);

    int insert(SubjectStatus record);

    int insertSelective(SubjectStatus record);

    List<SubjectStatus> selectByExample(SubjectStatusExample example);

    int updateByExampleSelective(@Param("record") SubjectStatus record, @Param("example") SubjectStatusExample example);

    int updateByExample(@Param("record") SubjectStatus record, @Param("example") SubjectStatusExample example);
}