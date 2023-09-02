package com.test.test.domain.test.api.v1;

import com.test.test.domain.test.api.v1.request.UserRequest;
import com.test.test.domain.test.entity.Users;
import com.test.test.domain.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/test")
public class TestController {
    @Autowired
    UserService userService;

    @PostMapping("/new-user")
    public ResponseEntity<String> create (@RequestBody UserRequest userRequest) {
        String message = userService.create(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }

    @GetMapping("/list-users")
    public ResponseEntity<List<Users>> listUser () {
        return ResponseEntity.status(HttpStatus.OK).body(userService.listUsers());
    }
}
