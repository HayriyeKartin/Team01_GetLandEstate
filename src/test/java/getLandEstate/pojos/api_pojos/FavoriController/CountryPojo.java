package getLandEstate.pojos.api_pojos.FavoriController;

import java.io.Serializable;

public class CountryPojo implements Serializable {
	private int id;
	private String name;
	private LocationPojo location;

	public CountryPojo() {
	}

	public CountryPojo(int id, String name, LocationPojo location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLocation(LocationPojo location){
		this.location = location;
	}

	public LocationPojo getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"CountryPojo{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",location = '" + location + '\'' + 
			"}";
		}
}