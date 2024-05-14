package getLandEstate.pojos.api_pojos.UserController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserE2EPatchResponsePojo implements Serializable {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String role;

	public UserE2EPatchResponsePojo() {
	}

	public UserE2EPatchResponsePojo(int id, String firstName, String lastName, String email, String phone, String role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.role = role;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
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
			"UserPatchResponsePojo{" +
			"id = '" + id + '\'' +
			",firstName = '" + firstName + '\'' +
			",lastName = '" + lastName + '\'' +
			",email = '" + email + '\'' +
			",phone = '" + phone + '\'' +
			",role = '" + role + '\'' +
			"}";
		}
}
