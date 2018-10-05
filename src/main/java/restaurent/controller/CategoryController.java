package restaurent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurent.entity.Category;
import restaurent.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public List<Category> getCategories() {
		return categoryService.getCategories();
	}

	@GetMapping("/{category_id}")
	public Category getCategory(@PathVariable("category_id") Integer categoryId) {
		return categoryService.getCategory(categoryId);
	}

	@PostMapping
	public void addCategory(@RequestBody Category category) {
		categoryService.saveCategory(category);
	}

	@PutMapping("/{category_id}")
	public void updateCategory(@PathVariable("category_id") Integer categoryId) {
		Category category = new Category(categoryId);
		categoryService.updateCategory(category);
	}

	@DeleteMapping("/{category_id}")
	public Category deleteCategory(@PathVariable("category_id") Integer categoryId) {
		return categoryService.deleteCategory(categoryId);
	}

}
