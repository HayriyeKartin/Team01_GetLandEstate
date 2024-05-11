package getLandEstate.pojos.api_pojos.TourRequestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TourRequestPageResponsePojo implements Serializable {
    private List<TourRequestContentPojo> content;

    public TourRequestPageResponsePojo() {
    }

    public TourRequestPageResponsePojo(List<TourRequestContentPojo> content) {
        this.content = content;
    }

    public void setContent(List<TourRequestContentPojo> content){
        this.content = content;
    }

    public List<TourRequestContentPojo> getContent(){
        return content;
    }

    @Override
    public String toString(){
        return
                "TourRequestPageResponsePojo{" +
                        "content = '" + content + '\'' +
                        "}";
    }
}