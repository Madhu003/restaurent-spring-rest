package restaurent.service;

import java.util.List;

import restaurent.entity.Category;
import restaurent.entity.MenuItem;

public interface CategoryService {

	public List<Category> getCategories();

	public Category getCategory(int CategoryId);

	public void saveCategory(Category category);

	public Category updateCategory(Category category);

	public Category deleteCategory(int CategoryId);

	public List<MenuItem> getMenuItemListByCategoryId(int CategoryId);
}
