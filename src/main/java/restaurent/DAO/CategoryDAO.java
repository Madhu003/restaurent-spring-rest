package restaurent.DAO;

import java.util.List;

import restaurent.entity.Category;
import restaurent.entity.MenuItem;

public interface CategoryDAO {

	public List<Category> getCategories();

	public void saveCategory(Category category);

	public Category updateCategory(Category category);

	public Category getCategory(int CategoryId);

	public Category deleteCategory(int CategoryId);

	public List<MenuItem> getMenuItemListByCategoryId(int CategoryId);

}
