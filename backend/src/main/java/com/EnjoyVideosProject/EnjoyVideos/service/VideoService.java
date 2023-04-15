package com.EnjoyVideosProject.EnjoyVideos.service;

import com.EnjoyVideosProject.EnjoyVideos.model.Video;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@AllArgsConstructor
public class VideoService {
    private final S3Service s3Service;
    public void uploadVideo(MultipartFile multipartFile){
        //Separate class to upload video on AWS S3
        //Save data to database
        String videoUrl = s3Service.uploadFile(multipartFile);
        var Video = new Video();
        Video.setVideosUrl(videoUrl);
    }
}
