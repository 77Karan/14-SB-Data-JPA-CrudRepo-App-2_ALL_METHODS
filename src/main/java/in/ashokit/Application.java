package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.StudentEntity;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepo = context.getBean(StudentRepository.class);
		System.out.println(studentRepo.getClass().getName());
		
		/*//1st method
		StudentEntity stu1 = new StudentEntity(104,"BHUVI","bhuvi@gami",14);
		studentRepo.save(stu1);
		System.out.println("Record Inserted>>save()");*/
		
		/*//2nd method
		StudentEntity stu2 = new StudentEntity(105,"David","david@gami",17);
		StudentEntity stu3 = new StudentEntity(106,"Abhi","abhi@gami",18);
		StudentEntity stu4 = new StudentEntity(107,"Rashid","rashid@gami",19);
		List<StudentEntity> studentList = Arrays.asList(stu2,stu3,stu4);
		studentRepo.saveAll(studentList);
		System.out.println("saveAll() method executing");*/
		
		/*//3rd Method
		System.out.println("Records avalible in table is :"+studentRepo.count());*/
		
		/*//4th method
		System.out.println(studentRepo.findById(222));*/
		
		/*//5th method
		List<Integer> idList = Arrays.asList(105,106,107);
		Iterable<StudentEntity> students= studentRepo.findAllById(idList);
		for(StudentEntity student : students)
		{
			System.out.println(student);
			
		}*/
		
		/*//6thmethod
		Iterable<StudentEntity> students = studentRepo.findAll();
		for(StudentEntity student:students)
		{
			System.out.println(student);
		}
		*/
		//7thmethod
		System.out.println(studentRepo.existsById(104));
		
		/*//8thmethod
		studentRepo.deleteById(104);
		
		//9th method
		List<Integer> idList = Arrays.asList(104,105,106);
		studentRepo.deleteAllById(idList);
		
		//10th method
		studentRepo.deleteAll();
		
		//11th method
		Iterable<StudentEntity> students = studentRepo.findAll();
		studentRepo.deleteAll(students);
		
		//12th method
		studentRepo.delete(new StudentEntity(104,"BHUVI","@bhuvi",14));
		*/
		


	}

}
