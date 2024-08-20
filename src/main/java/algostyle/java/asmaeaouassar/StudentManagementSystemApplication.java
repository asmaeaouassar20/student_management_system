package algostyle.java.asmaeaouassar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import algostyle.java.asmaeaouassar.entity.Student;
import algostyle.java.asmaeaouassar.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
	/*	Student student1=new Student("Asmae","Aouassar","asmae@gmail.com");
		studentRepository.save(student1);
		
		Student student2=new Student("Hatim","Afdrik","amine@gmail.com");
		studentRepository.save(student2);
		
		Student student3=new Student("Younes","Premier","younes@gmail.com");
		studentRepository.save(student3);*/
		
	}
	
	// instead of adding records in the database manually, 

}
