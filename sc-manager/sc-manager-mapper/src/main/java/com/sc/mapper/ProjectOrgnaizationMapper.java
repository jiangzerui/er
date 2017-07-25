package com.sc.mapper;

import com.sc.pojo.ProjectOrgnaization;
import com.sc.pojo.ProjectOrgnaizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectOrgnaizationMapper {
    long countByExample(ProjectOrgnaizationExample example);

    int deleteByExample(ProjectOrgnaizationExample example);

    int deleteByPrimaryKey(Integer projectOrgnaizationId);

    int insert(ProjectOrgnaization record);

    int insertSelective(ProjectOrgnaization record);

    List<ProjectOrgnaization> selectByExample(ProjectOrgnaizationExample example);

    ProjectOrgnaization selectByPrimaryKey(Integer projectOrgnaizationId);

    int updateByExampleSelective(@Param("record") ProjectOrgnaization record, @Param("example") ProjectOrgnaizationExample example);

    int updateByExample(@Param("record") ProjectOrgnaization record, @Param("example") ProjectOrgnaizationExample example);

    int updateByPrimaryKeySelective(ProjectOrgnaization record);

    int updateByPrimaryKey(ProjectOrgnaization record);
}