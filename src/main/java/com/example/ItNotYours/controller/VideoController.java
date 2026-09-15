package com.example.ItNotYours.controller;

import com.example.ItNotYours.entity.Video;
import com.example.ItNotYours.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videos")
@RequiredArgsConstructor
public class VideoController {
    private final VideoService videoService;

    @GetMapping("/{id}")
    public Video getVideo(@PathVariable Long id) {
        return videoService.getVideo(id);
    }
}
