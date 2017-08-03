package com.sc.mapper;

import com.sc.pojo.UserOrgnaization;
import com.sc.pojo.UserOrgnaizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrgnaizationMapper {
    long countByExample(UserOrgnaizationExample example);

    int deleteByExample(UserOrgnaizationExample example);

    int deleteByPrimaryKey(Integer userOrgnaizationId);

    int insert(UserOrgnaization record);

    int insertSelective(UserOrgnaization record);

    List<UserOrgnaization> selectByExample(UserOrgnaizationExample example);

    UserOrgnaization selectByPrimaryKey(Integer userOrgnaizationId);

    int updateByExampleSelective(@Param("record") UserOrgnaization record, @Param("example") UserOrgnaizationExample example);

    int updateByExample(@Param("record") UserOrgnaization record, @Param("example") UserOrgnaizationExample example);

    int updateByPrimaryKeySelective(UserOrgnaization record);

    int updateByPrimaryKey(UserOrgnaization record);
}