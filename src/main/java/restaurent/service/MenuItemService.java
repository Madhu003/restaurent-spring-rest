package restaurent.service;

import java.util.List;

import restaurent.entity.MenuItem;

public interface MenuItemService {
	
	public List<MenuItem> getMenuItems();
	
	public void saveMenuItem(MenuItem menuItem);

	public MenuItem getMenuItem(int MenuItemId);

	public void deleteMenuItem(int MenuItemId);

}
