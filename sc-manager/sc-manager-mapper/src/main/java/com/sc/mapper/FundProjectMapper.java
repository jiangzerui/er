package com.sc.mapper;

import com.sc.pojo.FundProject;
import com.sc.pojo.FundProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundProjectMapper {
    long countByExample(FundProjectExample example);

    int deleteByExample(FundProjectExample example);

    int insert(FundProject record);

    int insertSelective(FundProject record);

    List<FundProject> selectByExample(FundProjectExample example);

    int updateByExampleSelective(@Param("record") FundProject record, @Param("example") FundProjectExample example);

    int updateByExample(@Param("record") FundProject record, @Param("example") FundProjectExample example);
}