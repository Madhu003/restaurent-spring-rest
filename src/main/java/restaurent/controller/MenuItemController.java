package restaurent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurent.entity.MenuItem;

@RestController	
@RequestMapping("/menu_item")
public class MenuItemController {
	
	@GetMapping
	public MenuItem getList(){
		return new MenuItem("madhu", "sudan");
	}
}
