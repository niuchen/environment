package com.environment.mypuls.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.environment.mypuls.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author niuchen
 * @since 2017-10-25
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();
}