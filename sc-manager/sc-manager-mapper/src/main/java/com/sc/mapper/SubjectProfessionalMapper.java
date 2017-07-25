package com.sc.mapper;

import com.sc.pojo.SubjectProfessional;
import com.sc.pojo.SubjectProfessionalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectProfessionalMapper {
    long countByExample(SubjectProfessionalExample example);

    int deleteByExample(SubjectProfessionalExample example);

    int deleteByPrimaryKey(Integer subjectProfessionalId);

    int insert(SubjectProfessional record);

    int insertSelective(SubjectProfessional record);

    List<SubjectProfessional> selectByExample(SubjectProfessionalExample example);

    SubjectProfessional selectByPrimaryKey(Integer subjectProfessionalId);

    int updateByExampleSelective(@Param("record") SubjectProfessional record, @Param("example") SubjectProfessionalExample example);

    int updateByExample(@Param("record") SubjectProfessional record, @Param("example") SubjectProfessionalExample example);

    int updateByPrimaryKeySelective(SubjectProfessional record);

    int updateByPrimaryKey(SubjectProfessional record);
}