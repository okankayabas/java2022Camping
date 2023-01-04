package oopKodlamaioApp.dataAccess;

import oopKodlamaioApp.entities.Category;

public class JdbsCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori JDBC ile veri tabanına eklendi.");
	}

}
