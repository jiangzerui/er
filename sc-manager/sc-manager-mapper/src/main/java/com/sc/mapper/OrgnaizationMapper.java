package com.sc.mapper;

import com.sc.pojo.Orgnaization;
import com.sc.pojo.OrgnaizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgnaizationMapper {
    long countByExample(OrgnaizationExample example);

    int deleteByExample(OrgnaizationExample example);

    int deleteByPrimaryKey(Integer orgnaizationId);

    int insert(Orgnaization record);

    int insertSelective(Orgnaization record);

    List<Orgnaization> selectByExample(OrgnaizationExample example);

    Orgnaization selectByPrimaryKey(Integer orgnaizationId);

    int updateByExampleSelective(@Param("record") Orgnaization record, @Param("example") OrgnaizationExample example);

    int updateByExample(@Param("record") Orgnaization record, @Param("example") OrgnaizationExample example);

    int updateByPrimaryKeySelective(Orgnaization record);

    int updateByPrimaryKey(Orgnaization record);
}