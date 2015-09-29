package dao.impl;

import java.util.LinkedList;
import java.util.List;

import dao.ProductDao;
import dto.Product;

public class ProductDaoDummyImpl implements ProductDao {

    @Override
    public List<Product> getAllProducts() {
	List<Product> products = new LinkedList<>();
	products.add(new Product(1, "Hotel International"));
	products.add(new Product(2, "Готель Чернівці"));
	products.add(new Product(3, "Mövenpick Hotel Berlin"));
	return products;
    }

}
