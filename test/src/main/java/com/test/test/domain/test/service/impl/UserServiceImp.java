package com.test.test.domain.test.service.impl;

import com.test.test.domain.test.api.v1.request.UserRequest;
import com.test.test.domain.test.entity.Users;
import com.test.test.domain.test.repository.UserRepository;
import com.test.test.domain.test.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    @Override
    public String create(UserRequest userRequest) {
        Users users = new Users();
        BeanUtils.copyProperties(userRequest, users);
        userRepository.save(users);

        return "User save with success!";
    }

    @Override
    public List<Users> listUsers() {
        return userRepository.findAll();
    }
}
