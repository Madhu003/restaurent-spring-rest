package restaurent.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import restaurent.entity.MenuItem;

@Service
public class MenuItemServiceImp implements MenuItemService {

	@Override
	@Transactional
	public List<MenuItem> getMenuItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void saveMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public MenuItem getMenuItem(int MenuItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void deleteMenuItem(int MenuItemId) {
		// TODO Auto-generated method stub

	}

}
