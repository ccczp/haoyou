package com.czp.haoyou.service.impl;

import com.czp.haoyou.entity.User;
import com.czp.haoyou.mapper.UserMapper;
import com.czp.haoyou.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Brutus
 * @since 2021-03-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
