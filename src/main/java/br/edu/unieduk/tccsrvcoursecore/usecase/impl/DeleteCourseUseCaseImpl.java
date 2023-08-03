package br.edu.unieduk.tccsrvcoursecore.usecase.impl;

import br.edu.unieduk.tccsrvcoursecore.domain.RequestCourse;
import br.edu.unieduk.tccsrvcoursecore.external.repository.CourseRepository;
import br.edu.unieduk.tccsrvcoursecore.usecase.DeleteCourseUseCase;
import br.edu.unieduk.tccsrvcoursecore.usecase.adapter.CourseAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteCourseUseCaseImpl implements DeleteCourseUseCase {

    @Autowired
    private CourseRepository repository;
    @Override
    public void execute(String id) {
        repository.deleteById(id);
    }
}
