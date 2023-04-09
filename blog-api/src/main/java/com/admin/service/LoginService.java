package com.admin.service;

import com.admin.vo.Result;
import com.admin.vo.params.Account;

public interface LoginService {
    Result register(Account account);

    Result login(Account account);

    Result logout();

}
