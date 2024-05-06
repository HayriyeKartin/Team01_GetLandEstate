package getLandEstate.pojos.api_pojos.ContactController;
import java.io.Serializable;
public class ContactMessagePayloadPojo implements Serializable{

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String message;
    private boolean status;
    private String createdAt;

    public ContactMessagePayloadPojo() {
    }

    public ContactMessagePayloadPojo(int id, String firstName, String lastName, String email, String message, boolean status, String createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.message = message;
        this.status = status;
        this.createdAt = createdAt;
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

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean isStatus(){
        return status;
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
                "ContactPayloadPojo{" +
                        "id = '" + id + '\'' +
                        ",firstName = '" + firstName + '\'' +
                        ",lastName = '" + lastName + '\'' +
                        ",email = '" + email + '\'' +
                        ",message = '" + message + '\'' +
                        ",status = '" + status + '\'' +
                        ",createdAt = '" + createdAt + '\'' +
                        "}";
    }
}

