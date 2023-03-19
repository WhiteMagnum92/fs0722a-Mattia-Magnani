package com.springSecretCode.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.springSecretCode.models.Student;
import com.springSecretCode.services.StudentService;

@Component
public class StudentRunner implements ApplicationRunner {
	
	@Autowired StudentService studentService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Runner is running...");
		//setStudent();
		getAllStudents();
	}
	private void setStudent() {
		
		Student s1 = Student.builder()
							.name("Mario")
							.lastname("Rossi")
							.city("Roma")
							.age(25)
							.secretCode("123")
							.build();
		String Response = studentService.addStudent(s1);
		System.out.println(Response);
		
	}
	
	private void getAllStudents(){
		List<Student> listaStudenti = studentService.getAllStudents();
		listaStudenti.forEach(s->System.out.println(s));
	}
		
	

}
