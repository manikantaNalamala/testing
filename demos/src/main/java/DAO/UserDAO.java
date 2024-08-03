package DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.Student;

@Repository
public interface UserDAO extends MongoRepository<Student, Integer> {

}
