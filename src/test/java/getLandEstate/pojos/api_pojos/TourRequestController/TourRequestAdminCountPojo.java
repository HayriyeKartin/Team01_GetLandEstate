package getLandEstate.pojos.api_pojos.TourRequestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TourRequestAdminCountPojo implements Serializable {
    private int tourRequestCount;
    private int advertId;

    public TourRequestAdminCountPojo() {
    }

    public TourRequestAdminCountPojo(int tourRequestCount, int advertId) {
        this.tourRequestCount = tourRequestCount;
        this.advertId = advertId;
    }


    public void setTourRequestCount(int tourRequestCount){
        this.tourRequestCount = tourRequestCount;
    }

    public int getTourRequestCount(){
        return tourRequestCount;
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
                "TourRequestCountAdminPojo{" +
                        "tourRequestCount = '" + tourRequestCount + '\'' +
                        ",advertId = '" + advertId + '\'' +
                        "}";
    }
}
