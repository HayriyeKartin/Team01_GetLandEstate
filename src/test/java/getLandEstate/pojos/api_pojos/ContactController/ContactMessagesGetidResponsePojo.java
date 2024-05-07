package getLandEstate.pojos.api_pojos.ContactController;

import java.io.Serializable;

public class ContactMessagesGetidResponsePojo implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String message;
    private boolean status;
    private String createdAt;

    public ContactMessagesGetidResponsePojo() {

    }

    public ContactMessagesGetidResponsePojo(int id, String firstName, String lastName, String email, String message, boolean status, String createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.message = message;
        this.status = status;
        this.createdAt = createdAt;
    }


    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getMessage() {
        return message;
    }

    public boolean isStatus(){
        return status;
    }
    public String getCreatedAt(){
        return createdAt;
    }

    @Override
    public String toString(){
        return
                "ResponsePojo{" +
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

