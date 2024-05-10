package getLandEstate.pojos.api_pojos.FavoriController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FavoritesResponsePojo implements Serializable {
	private int favoriteId;
	private int advertId;
	private String title;
	private Object price;
	private LocationPojo location;
	private AdvertTypePojo advertType;
	private CountryPojo country;
	private CityPojo city;
	private DistrictPojo district;
	private CategoryPojo category;

	public FavoritesResponsePojo() {
	}

	public FavoritesResponsePojo(int favoriteId, int advertId, String title, Object price, LocationPojo location, AdvertTypePojo advertType, CountryPojo country, CityPojo city, DistrictPojo district, CategoryPojo category) {
		this.favoriteId = favoriteId;
		this.advertId = advertId;
		this.title = title;
		this.price = price;
		this.location = location;
		this.advertType = advertType;
		this.country = country;
		this.city = city;
		this.district = district;
		this.category = category;
	}

	public void setFavoriteId(int favoriteId){
		this.favoriteId = favoriteId;
	}

	public int getFavoriteId(){
		return favoriteId;
	}

	public void setAdvertId(int advertId){
		this.advertId = advertId;
	}

	public int getAdvertId(){
		return advertId;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setLocation(LocationPojo location){
		this.location = location;
	}

	public LocationPojo getLocation(){
		return location;
	}

	public void setAdvertType(AdvertTypePojo advertType){
		this.advertType = advertType;
	}

	public AdvertTypePojo getAdvertType(){
		return advertType;
	}

	public void setCountry(CountryPojo country){
		this.country = country;
	}

	public CountryPojo getCountry(){
		return country;
	}

	public void setCity(CityPojo city){
		this.city = city;
	}

	public CityPojo getCity(){
		return city;
	}

	public void setDistrict(DistrictPojo district){
		this.district = district;
	}

	public DistrictPojo getDistrict(){
		return district;
	}

	public void setCategory(CategoryPojo category){
		this.category = category;
	}

	public CategoryPojo getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"FavoritesResponsePojo{" + 
			"favoriteId = '" + favoriteId + '\'' + 
			",advertId = '" + advertId + '\'' + 
			",title = '" + title + '\'' + 
			",price = '" + price + '\'' + 
			",location = '" + location + '\'' + 
			",advertType = '" + advertType + '\'' + 
			",country = '" + country + '\'' + 
			",city = '" + city + '\'' + 
			",district = '" + district + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}