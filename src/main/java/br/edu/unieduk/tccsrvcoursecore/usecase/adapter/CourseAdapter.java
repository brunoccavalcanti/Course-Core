package br.edu.unieduk.tccsrvcoursecore.usecase.adapter;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.domain.RequestCourse;

import static java.util.Objects.isNull;

public class CourseAdapter {

    public static Course entityToModel(RequestCourse request) {
        return Course.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .qtdLikes(isNull(request.getQtdLikes()) ? "0" : request.getQtdLikes())
                .qtdDislikes(isNull(request.getQtdDislikes()) ? "0" : request.getQtdDislikes())
                .urlImage(request.getUrlImage())
                .urlVideo(request.getUrlVideo())
                .build();
    }
}
