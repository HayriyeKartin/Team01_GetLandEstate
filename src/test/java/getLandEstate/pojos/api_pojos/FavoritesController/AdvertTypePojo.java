package getLandEstate.pojos.api_pojos.FavoritesController;

import java.io.Serializable;

public class AdvertTypePojo implements Serializable {
	private int id;
	private String title;
	private boolean builtIn;

	public AdvertTypePojo() {
	}

	public AdvertTypePojo(int id, String title, boolean builtIn) {
		this.id = id;
		this.title = title;
		this.builtIn = builtIn;
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

	public void setBuiltIn(boolean builtIn){
		this.builtIn = builtIn;
	}

	public boolean isBuiltIn(){
		return builtIn;
	}

	@Override
 	public String toString(){
		return 
			"AdvertTypePojo{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",builtIn = '" + builtIn + '\'' + 
			"}";
		}
}