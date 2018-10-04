package restaurent.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/menu_item")
public class MenuItemController {
	
	@GetMapping
	public Map getList(){
		Map h = new HashMap();
		h.put("test", "api");
		return h;
//		return new MenuItem("madhu", "sudan");
	}
}
