package nLayeredApp.dataAccess.concretes.jdbcimpls;

import java.util.ArrayList;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao {

ArrayList<Product> products = new ArrayList<Product>();
	
	@Override
	public void add(Product addProduct) {
		for (Product product : products) {
			if(product.getId() == addProduct.getId()) {
				System.out.println("This product can not be added!");
				break;
			}else {
				products.add(addProduct);
			}
		}
		System.out.println(addProduct.getName()+" has been added via JDBC!");
	}

	@Override
	public void update(Product updateProduct) {
		for ( Product product : products) {
			if(product.getId() == updateProduct.getId()) {
				products.set(products.indexOf(product), updateProduct);
				System.out.println(product.getId()+" has been updated via JDBC!");
				return;
			}
			System.out.println("No match for Id!");
		}
		
	}

	@Override
	public void delete(Product deleteProduct) {
		for (Product product : products) {
			if(product.getId() == deleteProduct.getId()) {
				System.out.println(product.getId()+ " has been removed via JDBC!");
				products.remove(product);
				return;
			}
		}
		
	}

	@Override
	public ArrayList<Product> getAll() {
		
		return this.products;
	}

}
