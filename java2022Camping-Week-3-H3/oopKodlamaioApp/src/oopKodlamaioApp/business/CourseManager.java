package oopKodlamaioApp.business;

import oopKodlamaioApp.core.logging.Logger;
import oopKodlamaioApp.dataAccess.CourseDao;
import oopKodlamaioApp.entities.Course;

import java.util.ArrayList;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	private ArrayList<String> courses = new ArrayList<String>();

	public void add(Course course) throws Exception {

		courses.add(course.getCourseName());

		if (course.getPrice() < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		} else if (courses.contains(course.getCourseName())) {
			throw new Exception("İsmi aynı olan kurs eklenemez.");
		}

		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}

	}
}
