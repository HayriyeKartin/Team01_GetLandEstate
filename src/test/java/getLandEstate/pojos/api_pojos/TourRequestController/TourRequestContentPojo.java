package getLandEstate.pojos.api_pojos.TourRequestController;

import java.io.Serializable;

public class TourRequestContentPojo implements Serializable {
    private int id;
    private String tourDate;
    private String tourTime;
    private String guestUserFullName;
    private String status;

    public TourRequestContentPojo() {
    }

    public TourRequestContentPojo(int id, String tourDate, String tourTime, String guestUserFullName, String status) {
        this.id = id;
        this.tourDate = tourDate;
        this.tourTime = tourTime;
        this.guestUserFullName = guestUserFullName;
        this.status = status;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setTourDate(String tourDate){
        this.tourDate = tourDate;
    }

    public String getTourDate(){
        return tourDate;
    }

    public void setTourTime(String tourTime){
        this.tourTime = tourTime;
    }

    public String getTourTime(){
        return tourTime;
    }

    public void setGuestUserFullName(String guestUserFullName){
        this.guestUserFullName = guestUserFullName;
    }

    public String getGuestUserFullName(){
        return guestUserFullName;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return
                "ContentPojo{" +
                        "id = '" + id + '\'' +
                        ",tourDate = '" + tourDate + '\'' +
                        ",tourTime = '" + tourTime + '\'' +
                        ",guestUserFullName = '" + guestUserFullName + '\'' +
                        ",status = '" + status + '\'' +
                        "}";
    }
}