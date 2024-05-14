package getLandEstate.pojos.api_pojos.UserController;

import java.io.Serializable;

public class UserE2EPayloadPojo implements Serializable {
	
	private String role;

	public UserE2EPayloadPojo() {
	}

	public UserE2EPayloadPojo(String role) {
		this.role = role;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	@Override
 	public String toString(){
		return 
			"PatchUserPayloadPojo{" + 
			"role = '" + role + '\'' + 
			"}";
		}
}
