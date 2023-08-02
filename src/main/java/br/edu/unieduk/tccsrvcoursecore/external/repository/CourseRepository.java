package br.edu.unieduk.tccsrvcoursecore.external.repository;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {

}