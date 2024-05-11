package getLandEstate.pojos.api_pojos.TourRequestController;

import java.io.Serializable;

public class TourRequestPayloadPojo implements Serializable {
    private String tourDate;
    private String tourTime;
    private int advertId;

    public TourRequestPayloadPojo() {
    }

    public TourRequestPayloadPojo(String tourDate, String tourTime, int advertId) {



        this.tourDate = tourDate;
        this.tourTime = tourTime;
        this.advertId = advertId;
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

    public void setAdvertId(int advertId){
        this.advertId = advertId;
    }

    public int getAdvertId(){
        return advertId;
    }

    @Override
    public String toString(){
        return
                "TourRequestPayloadPojo{" +
                        "tourDate = '" + tourDate + '\'' +
                        ",tourTime = '" + tourTime + '\'' +
                        ",advertId = '" + advertId + '\'' +
                        "}";
    }
}