package com.example.ItNotYours.storage;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class LocalStorageService implements StorageService{
    private final Path root = Paths.get("storage/videos");

    @Override
    public String save(MultipartFile file) throws IOException {
        Files.createDirectories(root);
        String filename = file.getOriginalFilename();
        Path destination = root.resolve(filename);
        file.transferTo(destination);
        return filename;
    }
}
