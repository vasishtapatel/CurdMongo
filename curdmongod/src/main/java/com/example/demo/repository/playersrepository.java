package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Players;

public interface playersrepository extends MongoRepository<Players,Integer> {

}
