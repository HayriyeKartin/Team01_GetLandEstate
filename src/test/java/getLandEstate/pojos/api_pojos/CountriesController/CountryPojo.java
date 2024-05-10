package getLandEstate.pojos.api_pojos.CountriesController;

import java.io.Serializable;

public class CountryPojo implements Serializable {
	private String name;
	private LocationPojo location;
	private Object id;

	public CountryPojo() {
	}

	public CountryPojo(String name, LocationPojo location, Object id) {
		this.name = name;
		this.location = location;
		this.id = id;
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

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"CountryPojo{" + 
			"name = '" + name + '\'' + 
			",location = '" + location + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}