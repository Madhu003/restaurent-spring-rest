package restaurent.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import restaurent.entity.Category;
import restaurent.entity.MenuItem;

public class CategoryAccessObject implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> getCategories() {
		Session session = sessionFactory.getCurrentSession();
		Query<Category> query = session.createQuery("from Category", Category.class);

		List<Category> categoryList = query.getResultList();
		return categoryList;
	}

	@Override
	public void saveCategory(Category category) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(category);
	}

	@Override
	public Category getCategory(int CategoryId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Category.class, CategoryId);
	}

	@Override
	public Category deleteCategory(int CategoryId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Category where id=:CategoryId");
		query.setParameter("customerId", CategoryId);

		query.executeUpdate();

		return null;
	}

	@Override
	public List<MenuItem> getMenuItemListByCategoryId(int CategoryId) {
		// Session session = sessionFactory.getCurrentSession();
		// Query<Category> query = session.createQuery("from Category",
		// Category.class);
		//
		// List<Category> categoryList = query.getResultList();
		return null;
	}

	@Override
	public Category updateCategory(Category category) {
		Session session = sessionFactory.getCurrentSession();
		session.update(category);
		return category;
	}

}
