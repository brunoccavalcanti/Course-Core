package br.edu.unieduk.tccsrvcoursecore.endpoint;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.domain.RequestCourse;
import br.edu.unieduk.tccsrvcoursecore.usecase.CreateCourseUseCase;
import br.edu.unieduk.tccsrvcoursecore.usecase.DeleteCourseUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequiredArgsConstructor
public class CoreController {

    private final CreateCourseUseCase createCourseUseCase;
    private final DeleteCourseUseCase deleteCourseUseCase;

    @PostMapping("/create-course")
    public Course createCourse(@RequestBody RequestCourse course) {
        return createCourseUseCase.execute(course);
    }

    @DeleteMapping("/delete-course/{id}")
    public void deleteCourse(@PathVariable String id) {
        deleteCourseUseCase.execute(id);
    }
}