package oopKodlamaioApp;

import oopKodlamaioApp.business.CategoryManager;
import oopKodlamaioApp.business.CourseManager;
import oopKodlamaioApp.business.InstructorManager;
import oopKodlamaioApp.core.logging.DatabaseLogger;
import oopKodlamaioApp.core.logging.FileLogger;
import oopKodlamaioApp.core.logging.Logger;
import oopKodlamaioApp.dataAccess.HibernateCourseDao;
import oopKodlamaioApp.dataAccess.JdbcInstructorDao;
import oopKodlamaioApp.dataAccess.JdbsCategoryDao;
import oopKodlamaioApp.entities.Category;
import oopKodlamaioApp.entities.Course;
import oopKodlamaioApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course = new Course("Ja",10);
		Course course2 = new Course("C",20);
		
		Category category = new Category("Programlama");
		Instructor instructor = new Instructor();
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
		courseManager.add(course2);
		
		CategoryManager categoryManager = new CategoryManager(new JdbsCategoryDao(), loggers);
		categoryManager.add(category);
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
	}

}
