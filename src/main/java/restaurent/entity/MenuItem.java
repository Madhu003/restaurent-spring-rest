package restaurent.entity;

public class MenuItem {
	String name;
	String imageUrl;
	
	public MenuItem(String name, String imageUrl) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
