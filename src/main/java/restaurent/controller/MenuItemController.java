package restaurent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/rest/menu_item")
public class MenuItemController {
	
	@GetMapping("/list")
	public String getList(){
		
		return "String Got!!";
	}
}
