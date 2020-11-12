package studentReg2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
	
	String name = "Jimi Hendrix";
	String age = "19";
	Student student = new Student(name, age);
	
	String username = name + age;
	
	@Test
	public void testName() {
		assertEquals(username, student.getUsername());
	}
	

}
