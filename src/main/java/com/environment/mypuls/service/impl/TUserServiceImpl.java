package com.environment.mypuls.service.impl;

import com.environment.mypuls.entity.TUser;
import com.environment.mypuls.mapper.TUserMapper;
import com.environment.mypuls.service.ITUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author niuchen
 * @since 2017-10-25
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {
	
}
