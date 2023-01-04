package oopKodlamaioApp.dataAccess;

import oopKodlamaioApp.entities.Course;

public class JdbsCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs JDBC ile veri tabanına eklendi.");
	}
	
}
