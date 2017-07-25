package com.sc.mapper;

import com.sc.pojo.SubjectResult;
import com.sc.pojo.SubjectResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectResultMapper {
    long countByExample(SubjectResultExample example);

    int deleteByExample(SubjectResultExample example);

    int deleteByPrimaryKey(Integer subjectResultId);

    int insert(SubjectResult record);

    int insertSelective(SubjectResult record);

    List<SubjectResult> selectByExample(SubjectResultExample example);

    SubjectResult selectByPrimaryKey(Integer subjectResultId);

    int updateByExampleSelective(@Param("record") SubjectResult record, @Param("example") SubjectResultExample example);

    int updateByExample(@Param("record") SubjectResult record, @Param("example") SubjectResultExample example);

    int updateByPrimaryKeySelective(SubjectResult record);

    int updateByPrimaryKey(SubjectResult record);
}