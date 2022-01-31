package nLayeredApp;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.business.concretes.ProductManager;
import nLayeredApp.dataAccess.concretes.hibernateimpls.ProductHibernateDao;
import nLayeredApp.dataAccess.concretes.jdbcimpls.ProductJdbcDao;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService1 = new ProductManager(new ProductHibernateDao());
		ProductService productService2 = new ProductManager(new ProductJdbcDao());
		
		Product prod1 = new Product(1, "Elma", 20);
		Product prod2 = new Product(2, "Çilek", 20);
		Product prod3 = new Product(3, "Karpuz", 20);

		productService1.add(prod1);
		productService1.add(prod2);
		productService1.add(prod3);
		
		productService2.add(prod1);
		productService2.add(prod2);
		productService2.add(prod3);
		
	}

}

