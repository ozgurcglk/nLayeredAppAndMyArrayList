package nLayeredApp.dataAccess.concretes.jdbcimpls;

import java.util.ArrayList;

import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryJdbcDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile eklendi");		
		
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC ile güncellendi");		
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC ile silindi");		
		
	}

	@Override
	public ArrayList<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
