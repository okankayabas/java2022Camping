package oopKodlamaioApp.dataAccess;

import oopKodlamaioApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen hibernate ile veritabanına eklendi");
	}

}
