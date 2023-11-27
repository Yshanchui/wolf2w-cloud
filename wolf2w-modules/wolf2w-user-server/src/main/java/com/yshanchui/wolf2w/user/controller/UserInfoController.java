package com.yshanchui.wolf2w.user.controller;

import com.yshanchui.wolf2w.user.service.UserInfoService;
import com.yshanchui.wolf2w.user.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping
    public List<UserInfo> all(){
        return userInfoService.list();
    }

    @GetMapping("/{id}")
    public UserInfo findById(@PathVariable Long id){
        return  userInfoService.getById(id);
    }
}
