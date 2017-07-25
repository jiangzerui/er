package com.sc.mapper;

import com.sc.pojo.FundProjectNews;
import com.sc.pojo.FundProjectNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundProjectNewsMapper {
    long countByExample(FundProjectNewsExample example);

    int deleteByExample(FundProjectNewsExample example);

    int deleteByPrimaryKey(Integer newId);

    int insert(FundProjectNews record);

    int insertSelective(FundProjectNews record);

    List<FundProjectNews> selectByExampleWithBLOBs(FundProjectNewsExample example);

    List<FundProjectNews> selectByExample(FundProjectNewsExample example);

    FundProjectNews selectByPrimaryKey(Integer newId);

    int updateByExampleSelective(@Param("record") FundProjectNews record, @Param("example") FundProjectNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") FundProjectNews record, @Param("example") FundProjectNewsExample example);

    int updateByExample(@Param("record") FundProjectNews record, @Param("example") FundProjectNewsExample example);

    int updateByPrimaryKeySelective(FundProjectNews record);

    int updateByPrimaryKeyWithBLOBs(FundProjectNews record);

    int updateByPrimaryKey(FundProjectNews record);
}