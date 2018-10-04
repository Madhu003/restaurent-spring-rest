package restaurent.entity;

public class MenuItem {
	String title;
	String imageUrl;
	String description;
	String itemCode;
	Double price;

	public MenuItem(String title, String imageUrl, String description, String itemCode, Double price) {
		super();
		this.title = title;
		this.imageUrl = imageUrl;
		this.description = description;
		this.itemCode = itemCode;
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
