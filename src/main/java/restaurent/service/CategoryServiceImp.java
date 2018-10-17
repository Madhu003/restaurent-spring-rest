package restaurent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import restaurent.DAO.CategoryDAO;
import restaurent.entity.Category;
import restaurent.entity.MenuItem;

@Service
public class CategoryServiceImp implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;

	@Override
	@Transactional
	public List<Category> getCategories() {
		return categoryDAO.getCategories();
	}

	@Override
	@Transactional
	public void saveCategory(Category category) {
		categoryDAO.saveCategory(category);
	}

	@Override
	@Transactional
	public Category getCategory(int CategoryId) {
		return categoryDAO.getCategory(CategoryId);
	}

	@Override
	@Transactional
	public Category deleteCategory(int CategoryId) {
		return categoryDAO.deleteCategory(CategoryId);

	}

	@Override
	@Transactional
	public List<MenuItem> getMenuItemListByCategoryId(int CategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Category updateCategory(Category category) {
		return categoryDAO.updateCategory(category);

	}

}
