package dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import dao.ProductDao;
import dto.Product;

public class ProductDaoMybatisImpl extends SqlSessionDaoSupport implements ProductDao {

    private SqlSessionTemplate sqlSessionTemplate;

    private SqlSessionFactory sqlSessionFactory;

    public ProductDaoMybatisImpl(SqlSessionFactory sqlSessionFactory) {
	this.sqlSessionFactory = sqlSessionFactory;
    }

    public ProductDaoMybatisImpl(SqlSessionTemplate sqlSessionTemplate) {
	this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Product> getAllProducts() {
	SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession();
	sqlSession = sqlSessionFactory.openSession();
	sqlSession = getSqlSession();

	return new LinkedList<Product>();
    }

}
