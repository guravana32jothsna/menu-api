package com.food.fullstackcomplete.repository;

import com.food.fullstackcomplete.model.User_db;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User_db , Integer> {
    Optional<User_db> findOneByEmailAndPassword(String email ,String password);
    User_db findByEmail(String email);
}
