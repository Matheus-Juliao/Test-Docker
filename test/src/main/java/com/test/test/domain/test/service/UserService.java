package com.test.test.domain.test.service;

import com.test.test.domain.test.api.v1.request.UserRequest;
import com.test.test.domain.test.entity.Users;

import java.util.List;

public interface UserService {
    String create(UserRequest userRequest);
    List<Users> listUsers();
}
