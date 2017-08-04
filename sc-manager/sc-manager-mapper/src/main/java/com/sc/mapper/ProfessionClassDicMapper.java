package com.sc.mapper;

import com.sc.pojo.ProfessionClassDic;
import com.sc.pojo.ProfessionClassDicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionClassDicMapper {
    long countByExample(ProfessionClassDicExample example);

    int deleteByExample(ProfessionClassDicExample example);

    int deleteByPrimaryKey(Integer pClassId);

    int insert(ProfessionClassDic record);

    int insertSelective(ProfessionClassDic record);

    List<ProfessionClassDic> selectByExample(ProfessionClassDicExample example);

    ProfessionClassDic selectByPrimaryKey(Integer pClassId);

    int updateByExampleSelective(@Param("record") ProfessionClassDic record, @Param("example") ProfessionClassDicExample example);

    int updateByExample(@Param("record") ProfessionClassDic record, @Param("example") ProfessionClassDicExample example);

    int updateByPrimaryKeySelective(ProfessionClassDic record);

    int updateByPrimaryKey(ProfessionClassDic record);
}