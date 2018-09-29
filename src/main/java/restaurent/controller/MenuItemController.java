package restaurent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/rest/menu_item")
public class MenuItemController {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList(){
		
		return "String Got!!";
	}
}
