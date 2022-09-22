package training.busboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Coords {
    //fields
    private String resultlatitude;
    private String resultlongitude;
    //constructors
    public Coords() {    
    }
    //getters
    public String getResultlatitude() {
        return resultlatitude;
    }
    public String getResultlongitude() {
        return resultlongitude;
    }
    //setters
    public void setResultlatitude(String resultlatitude) {
        this.resultlatitude = resultlatitude;
    }
    public void setResultlongitude(String resultlongitude) {
        this.resultlongitude = resultlongitude;
    }
}
