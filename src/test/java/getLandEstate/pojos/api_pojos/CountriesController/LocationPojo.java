package getLandEstate.pojos.api_pojos.CountriesController;

import java.io.Serializable;

public class LocationPojo implements Serializable {
	private Object lng;
	private Object lat;

	public LocationPojo() {
	}

	public LocationPojo(Object lng, Object lat) {
		this.lng = lng;
		this.lat = lat;
	}

	public void setLng(Object lng){
		this.lng = lng;
	}

	public Object getLng(){
		return lng;
	}

	public void setLat(Object lat){
		this.lat = lat;
	}

	public Object getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"LocationPojo{" + 
			"lng = '" + lng + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}