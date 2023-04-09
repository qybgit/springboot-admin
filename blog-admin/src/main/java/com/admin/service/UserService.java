package com.admin.service;

import com.admin.vo.params.Account;
import com.framework.vo.Result;

public interface UserService {
    Result login(Account account);

    Result logout();
}
