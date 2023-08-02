package br.edu.unieduk.tccsrvcoursecore.usecase.adapter;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.domain.RequestCourse;

public class CourseAdapter {

    public static Course entityToModel(RequestCourse request) {
        return Course.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .qtdLikes("0")
                .qtdDislikes("0")
                .urlImage(request.getUrlImage())
                .urlVideo(request.getUrlVideo())
                .build();
    }
}
