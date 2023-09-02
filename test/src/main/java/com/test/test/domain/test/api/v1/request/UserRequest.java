package com.test.test.domain.test.api.v1.request;

import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private String email;
    private String password;
}
