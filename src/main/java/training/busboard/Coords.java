package training.busboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Coords {
    //fields
    private String latitude;
    private String longitude;
    //constructors
    public Coords() {
        
    }
    //getters
    public String getLatitude() {
        return latitude;
    }
    public String getLongitude() {
        return longitude;
    }
    //setters
    public void setLatitude(String latitude) {
        latitude = latitude;
    }
    public void setLongitude(String longitude) {
        longitude = longitude;
    }
}
