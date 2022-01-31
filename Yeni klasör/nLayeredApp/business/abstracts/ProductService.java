package nLayeredApp.business.abstracts;

import java.util.ArrayList;
import nLayeredApp.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	ArrayList<Product> getAll();
}
