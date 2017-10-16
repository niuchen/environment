package com.environment.mapper;

import com.environment.domain.TWindDirectDic;
import com.environment.domain.TWindDirectDicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWindDirectDicMapper {
    int insert(TWindDirectDic record);

    int insertSelective(TWindDirectDic record);

    List<TWindDirectDic> selectByExample(TWindDirectDicExample example);

    int updateByExampleSelective(@Param("record") TWindDirectDic record, @Param("example") TWindDirectDicExample example);

    int updateByExample(@Param("record") TWindDirectDic record, @Param("example") TWindDirectDicExample example);
}