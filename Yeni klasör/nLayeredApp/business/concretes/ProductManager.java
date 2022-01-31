package nLayeredApp.business.concretes;

import java.util.ArrayList;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	
	
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override // interfaceden geldiði için
	public void add(Product product) {
		// Business rules
		if(product.getUnitPrice()>0) {
			this.productDao.add(product);
			System.out.println("Eklendi");
		}
	
	}

	@Override
	public void update(Product product) {
		System.out.println("Güncellendi");
	}

	@Override
	public void delete(Product product) {
		System.out.println("Silindi");
	}

	@Override
	public ArrayList<Product> getAll() {
		return this.productDao.getAll();
	}
}
