package dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import dao.ProductDao;
import dto.Product;

public class ProductDaoJDBCImpl implements ProductDao {
	
	private JdbcTemplate jdbcTemplate;

	public ProductDaoJDBCImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Product> getAllProducts() {
		return jdbcTemplate.queryForList("select * from product", Product.class);
	}

}







