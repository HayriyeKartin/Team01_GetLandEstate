package getLandEstate.pojos.api_pojos.TourRequestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TourRequestResponsePojo implements Serializable {
    private int id;
    private String tourDate;
    private String tourTime;
    private String status;

    public TourRequestResponsePojo() {
    }

    public TourRequestResponsePojo(int id, String tourDate, String tourTime, String status) {
        this.id = id;
        this.tourDate = tourDate;
        this.tourTime = tourTime;
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

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return
                "TourRequestResponsePojo{" +
                        "id = '" + id + '\'' +
                        ",tourDate = '" + tourDate + '\'' +
                        ",tourTime = '" + tourTime + '\'' +
                        ",status = '" + status + '\'' +
                        "}";
    }
}