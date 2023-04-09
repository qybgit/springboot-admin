package com.admin.service;

import com.admin.dao.pojo.SysUser;
import com.admin.vo.SysUserVo;

public interface SysUserService {

    SysUserVo selectUserById(long to_uid);

    SysUser checkToken(String token);
}
