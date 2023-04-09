package com.admin.controller;

import com.admin.service.LoginService;
import com.admin.vo.Result;
import com.admin.vo.params.Account;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {
    @Resource
    LoginService loginService;
    @RequestMapping("login")
    public Result login(@RequestBody Account account){

        return loginService.login(account) ;
    }
    @RequestMapping("logout")
    public Result logout(){
        return loginService.logout();
    }
}
