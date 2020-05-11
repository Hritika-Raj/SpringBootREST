package com.websystique.springboot.util;

import org.springframework.data.repository.CrudRepository;

import com.websystique.springboot.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
