package com.ecommerce.example;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.example.User;

@SuppressWarnings("unused")
public interface UserRepository extends JpaRepository<User, String> {
}
