package com.filestore.demo.repository;

import com.filestore.demo.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepo extends JpaRepository<FileDB ,String> {
}
