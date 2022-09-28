package com.cloudflash.kafkadatabasedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloudflash.kafkadatabasedemo.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long> { 

}
