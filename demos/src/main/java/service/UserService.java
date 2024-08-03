package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import DAO.UserDAO;
import model.Student;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;

	public Student addInfo(Student student) {
		return userDAO.save(student);
	}

}
