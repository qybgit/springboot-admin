package com.example.service;

import com.example.dao.pojo.SysUser;
import com.example.vo.SysUserVo;

public interface SysUserService {

    SysUserVo selectUserById(long to_uid);

    SysUser checkToken(String token);
}
