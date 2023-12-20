package com.food.fullstackcomplete.repository;

import com.food.fullstackcomplete.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepo extends JpaRepository<FileDB ,String> {

}
