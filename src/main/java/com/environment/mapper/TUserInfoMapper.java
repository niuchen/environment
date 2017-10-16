package com.environment.mapper;

import com.environment.domain.TUserInfo;
import com.environment.domain.TUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserInfoMapper {
    int deleteByPrimaryKey(Integer i_user_id);

    int insert(TUserInfo record);

    int insertSelective(TUserInfo record);

    List<TUserInfo> selectByExample(TUserInfoExample example);

    TUserInfo selectByPrimaryKey(Integer i_user_id);

    int updateByExampleSelective(@Param("record") TUserInfo record, @Param("example") TUserInfoExample example);

    int updateByExample(@Param("record") TUserInfo record, @Param("example") TUserInfoExample example);

    int updateByPrimaryKeySelective(TUserInfo record);

    int updateByPrimaryKey(TUserInfo record);
}