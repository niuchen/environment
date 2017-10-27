package com.environment.mypuls.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.environment.mypuls.entity.User;
import com.environment.mypuls.mapper.UserMapper;
import com.environment.mypuls.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author niuchen
 * @since 2017-10-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public boolean deleteAll() {
        return retBool(baseMapper.deleteAll());
    }

    @Override
    public List<User> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }
}
