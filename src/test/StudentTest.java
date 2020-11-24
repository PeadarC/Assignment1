package stuReg3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import studentReg.Student;

public class StudentTest {
	
	String name = "Jimi Hendrix";
	int age = 19;
	int id = 17461562;
	Student student = new Student(name, age, null, id);
	
	String username = name + age;
	
	@Test
	public void testName() {
		assertEquals(username, student.getUsername());
	}
	

}
