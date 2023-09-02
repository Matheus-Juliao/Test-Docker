package com.test.test.domain.test.repository;

import com.test.test.domain.test.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
