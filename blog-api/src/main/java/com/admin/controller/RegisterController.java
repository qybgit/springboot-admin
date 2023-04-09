package com.admin.controller;

import com.admin.service.LoginService;
import com.admin.vo.Result;
import com.admin.vo.params.Account;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RegisterController {

    @Resource
    LoginService loginService;

    /**
     * 注册
     * @param account
     * @return
     */
    @RequestMapping("register")
    public Result register(@RequestBody Account account){

        return loginService.register(account);
    }
}
