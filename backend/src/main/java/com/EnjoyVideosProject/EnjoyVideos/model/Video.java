package com.EnjoyVideosProject.EnjoyVideos.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document(value="Video")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {

    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private Integer likes;
    private Integer dislikes;
    private Set<String> tags;
    private String videosUrl;
    private VideoStatus videoStatus;
    private Integer videoCount;
    private String thumbnailUrl;
    private List<Comment> commentList;
}
