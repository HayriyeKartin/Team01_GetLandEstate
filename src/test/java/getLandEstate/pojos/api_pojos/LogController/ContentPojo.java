package getLandEstate.pojos.api_pojos.LogController;

import java.io.Serializable;

public class ContentPojo implements Serializable {
	private int id;
	private String message;
	private String createdAt;

	public ContentPojo() {
	}

	public ContentPojo(int id, String message, String createdAt) {
		this.id = id;
		this.message = message;
		this.createdAt = createdAt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	@Override
 	public String toString(){
		return 
			"ContentPojo{" + 
			"id = '" + id + '\'' + 
			",message = '" + message + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			"}";
		}
}