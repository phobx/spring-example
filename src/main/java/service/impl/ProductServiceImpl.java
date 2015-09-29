package service.impl;

import java.util.List;

import dao.ProductDao;
import dto.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    public ProductDao getProductDao() {
	return productDao;
    }

    public void setProductDao(ProductDao productDao) {
	this.productDao = productDao;
    }

    @Override
    public List<Product> getSomeProducts() {

	List<Product> allProducts = productDao.getAllProducts();

	// select only some products

	return allProducts;
    }

}
