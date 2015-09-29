package dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.ProductDao;
import dto.Product;

public class ProductDaoHibernateImpl extends HibernateDaoSupport implements ProductDao {

    @Override
    public List<Product> getAllProducts() {
	DetachedCriteria dc = DetachedCriteria.forClass(Product.class);
	dc.add(Restrictions.eq("deleted", false));
	@SuppressWarnings("unchecked")
	List<Product> products = (List<Product>) getHibernateTemplate().findByCriteria(dc);
	return products;
    }

}
