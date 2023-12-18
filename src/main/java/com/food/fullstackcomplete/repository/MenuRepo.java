package com.food.fullstackcomplete.repository;

import com.food.fullstackcomplete.model.Menu_db;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository <Menu_db , Integer>{
}
