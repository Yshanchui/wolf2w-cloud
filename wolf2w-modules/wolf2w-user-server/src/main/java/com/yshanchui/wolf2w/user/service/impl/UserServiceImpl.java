package com.yshanchui.wolf2w.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yshanchui.wolf2w.user.mapper.UserInfoMapper;
import com.yshanchui.wolf2w.user.service.UserInfoService;
import com.yshanchui.wolf2w.user.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
}
