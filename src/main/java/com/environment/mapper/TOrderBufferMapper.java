package com.environment.mapper;

import com.environment.domain.TOrderBuffer;
import com.environment.domain.TOrderBufferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderBufferMapper {
    int deleteByPrimaryKey(Long i_id);

    int insert(TOrderBuffer record);

    int insertSelective(TOrderBuffer record);

    List<TOrderBuffer> selectByExample(TOrderBufferExample example);

    TOrderBuffer selectByPrimaryKey(Long i_id);

    int updateByExampleSelective(@Param("record") TOrderBuffer record, @Param("example") TOrderBufferExample example);

    int updateByExample(@Param("record") TOrderBuffer record, @Param("example") TOrderBufferExample example);

    int updateByPrimaryKeySelective(TOrderBuffer record);

    int updateByPrimaryKey(TOrderBuffer record);
}