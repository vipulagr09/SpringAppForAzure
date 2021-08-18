package com.example.elk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.elk.model.User;

@Repository
public interface UserRepository extends  CrudRepository<User, Integer>{


}
