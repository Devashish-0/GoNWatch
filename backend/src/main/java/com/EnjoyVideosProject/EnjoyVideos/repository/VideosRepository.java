package com.EnjoyVideosProject.EnjoyVideos.repository;

import com.EnjoyVideosProject.EnjoyVideos.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideosRepository extends MongoRepository<Video, String> {
}
