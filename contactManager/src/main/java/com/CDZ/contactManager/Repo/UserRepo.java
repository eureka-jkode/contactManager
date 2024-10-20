package com.CDZ.contactManager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CDZ.contactManager.entinties.User;

public interface UserRepo extends  JpaRepository<User,Integer> {

}
