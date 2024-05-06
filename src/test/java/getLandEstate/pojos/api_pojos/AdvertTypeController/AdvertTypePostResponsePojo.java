package getLandEstate.pojos.api_pojos.AdvertTypeController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertTypePostResponsePojo implements Serializable {
	private int id;
	private String title;
	private String builtIn;

	public AdvertTypePostResponsePojo() {
	}

	public AdvertTypePostResponsePojo(int id, String title, String builtIn) {
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

	public void setBuiltIn(String builtIn){
		this.builtIn = builtIn;
	}

	public String isBuiltIn(){
		return builtIn;
	}

	@Override
	public String toString(){
		return
				"AdvertPostResponsePojo{" +
						"id = '" + id + '\'' +
						",title = '" + title + '\'' +
						",builtIn = '" + builtIn + '\'' +
						"}";
	}
}