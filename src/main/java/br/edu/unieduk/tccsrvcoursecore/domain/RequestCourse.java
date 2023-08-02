package br.edu.unieduk.tccsrvcoursecore.domain;

import lombok.Data;

@Data
public class RequestCourse {

    private String title;
    private String content;
    private String qtdLikes;
    private String qtdDislikes;
    private String urlImage;
    private String urlVideo;
}
