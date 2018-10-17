package restaurent.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/menu_item")
public class MenuItemController {

	@GetMapping
	public Map getList() {
		Map map = new HashMap();
		map.put("madhu", "sudan");
		return map;
	}
}
