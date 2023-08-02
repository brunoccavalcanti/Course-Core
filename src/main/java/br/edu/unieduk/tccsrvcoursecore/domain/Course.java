package br.edu.unieduk.tccsrvcoursecore.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
public class Course {

    @Id
    private String id;
    private String title;
    private String content;
    private String qtdLikes;
    private String qtdDislikes;
    private String urlImage;
    private String urlVideo;

}
