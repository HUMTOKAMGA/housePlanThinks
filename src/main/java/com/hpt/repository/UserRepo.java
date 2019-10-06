package com.hpt.repository;

import org.springframework.data.repository.CrudRepository;

import com.hpt.model.UserMo;

public interface UserRepo extends CrudRepository<UserMo, Integer>{

}
