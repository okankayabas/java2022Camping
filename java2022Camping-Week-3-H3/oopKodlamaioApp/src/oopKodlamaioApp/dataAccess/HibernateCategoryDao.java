package oopKodlamaioApp.dataAccess;

import oopKodlamaioApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	@Override
	public void add(Category category) {
		System.out.println("Kategori hibernate ile veritabanına eklendi");
	}
}
