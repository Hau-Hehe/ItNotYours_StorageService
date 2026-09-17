package com.example.ItNotYours.storage;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface StorageService {
    String save(MultipartFile file) throws IOException;
}
