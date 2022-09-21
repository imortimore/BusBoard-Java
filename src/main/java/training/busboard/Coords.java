package training.busboard;

public class Coords {
    //fields
    private String latitude;
    private String longitude;
    //constructors
    public Coords(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
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
