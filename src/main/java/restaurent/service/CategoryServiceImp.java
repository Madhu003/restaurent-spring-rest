package restaurent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import restaurent.DAO.CategoryDAO;
import restaurent.entity.Category;
import restaurent.entity.MenuItem;

public class CategoryServiceImp implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;

	@Override
	public List<Category> getCategories() {
		return categoryDAO.getCategories();
	}

	@Override
	public void saveCategory(Category category) {
		categoryDAO.saveCategory(category);
	}

	@Override
	public Category getCategory(int CategoryId) {
		return categoryDAO.getCategory(CategoryId);
	}

	@Override
	public Category deleteCategory(int CategoryId) {
		return categoryDAO.deleteCategory(CategoryId);

	}

	@Override
	public List<MenuItem> getMenuItemListByCategoryId(int CategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryDAO.updateCategory(category);
	}

}
