package br.edu.unieduk.tccsrvcoursecore.usecase;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.domain.RequestCourse;

public interface CreateCourseUseCase {

    Course execute(RequestCourse requestCourse);

}
