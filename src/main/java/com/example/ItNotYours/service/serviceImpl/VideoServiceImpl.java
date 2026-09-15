package com.example.ItNotYours.service.serviceImpl;

import com.example.ItNotYours.entity.Video;
import com.example.ItNotYours.repository.VideoRepository;
import com.example.ItNotYours.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {
    private final VideoRepository videoRepository;

    @Override
    public Video getVideo(Long id) {
        return videoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Video not found"));
    }
}
