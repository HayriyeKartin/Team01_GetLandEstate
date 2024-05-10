package getLandEstate.pojos.api_pojos.FavoriController;

import java.io.Serializable;

public class CategoryPojo implements Serializable {
	private int id;
	private String title;

	public CategoryPojo() {
	}

	public CategoryPojo(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"CategoryPojo{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}