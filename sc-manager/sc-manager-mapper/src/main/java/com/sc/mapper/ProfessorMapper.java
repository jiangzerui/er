package com.sc.mapper;

import com.sc.pojo.Professor;
import com.sc.pojo.ProfessorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessorMapper {
    long countByExample(ProfessorExample example);

    int deleteByExample(ProfessorExample example);

    int deleteByPrimaryKey(Integer professionalId);

    int insert(Professor record);

    int insertSelective(Professor record);

    List<Professor> selectByExample(ProfessorExample example);

    Professor selectByPrimaryKey(Integer professionalId);

    int updateByExampleSelective(@Param("record") Professor record, @Param("example") ProfessorExample example);

    int updateByExample(@Param("record") Professor record, @Param("example") ProfessorExample example);

    int updateByPrimaryKeySelective(Professor record);

    int updateByPrimaryKey(Professor record);
}