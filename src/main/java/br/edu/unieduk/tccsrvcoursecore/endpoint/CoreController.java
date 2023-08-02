package br.edu.unieduk.tccsrvcoursecore.endpoint;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.domain.RequestCourse;
import br.edu.unieduk.tccsrvcoursecore.usecase.CreateCourseUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequiredArgsConstructor
public class CoreController {

    private final CreateCourseUseCase createCourseUseCase;

    @PostMapping("/create-course")
    public Course createCourse(@RequestBody RequestCourse course) {
        course.setQtdLikes("0");
        course.setQtdDislikes("0");
        return createCourseUseCase.execute(course);
    }
}