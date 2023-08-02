package br.edu.unieduk.tccsrvcoursecore.usecase.impl;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.domain.RequestCourse;
import br.edu.unieduk.tccsrvcoursecore.external.repository.CourseRepository;
import br.edu.unieduk.tccsrvcoursecore.usecase.CreateCourseUseCase;
import br.edu.unieduk.tccsrvcoursecore.usecase.adapter.CourseAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseUseCaseImpl implements CreateCourseUseCase {

    @Autowired
    private CourseRepository repository;

    @Override
    public Course execute(RequestCourse requestCourse) {
        return repository.save(CourseAdapter.entityToModel(requestCourse));
    }
}