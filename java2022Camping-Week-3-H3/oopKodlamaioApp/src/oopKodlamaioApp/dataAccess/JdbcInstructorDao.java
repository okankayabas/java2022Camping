package oopKodlamaioApp.dataAccess;

import oopKodlamaioApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen JDBC ile veritabanına eklendi");
	}

}
