package com.food.fullstackcomplete.service;


import com.food.fullstackcomplete.model.FileDB;
import com.food.fullstackcomplete.repository.FileDBRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
public class FileService {
    @Autowired
    private FileDBRepo fileDBRepo;
    public FileDB store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB fileDB = new FileDB(fileName , file.getContentType() , file.getBytes());
        return fileDBRepo.save(fileDB);
    }
    public FileDB getFile(String id) {
        return fileDBRepo.findById(id).get();
    }
    public Stream<FileDB> getAllFiles() {
        return fileDBRepo.findAll().stream();
    }
}
