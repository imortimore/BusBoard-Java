package training.busboard;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.ws.rs.core.Response;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BustopResponse {
    private String id;
    private String stationName;
    private String lineId;
    private String destinationName;
    private Integer timeToStation;
    private String timestamp;
    private String expectedArrival;
//constructor 
    public BustopResponse(){
    }
//settters 
    public void setId(String id) {
        this.id = id;
    }
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public void setTimeToStation(Integer timeToStation) {
        this.timeToStation = timeToStation;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setExpectedArrival(String expectedArrival) {
        this.expectedArrival = expectedArrival;
    }
//getters
    public String getid(){
        return id;
    }
    public String getStationName(){
        return stationName;
    }
    public String getLineId(){
        return lineId;
    }
    public String getDestinationName(){
        return destinationName;
    }
    public Integer getTimeToStation(){
        return timeToStation;
    }
    public String getTimeStamp(){
        return timestamp;
    }
    public String getExpectedArrival(){
        return expectedArrival;
    }
//methods 
    public static LocalDateTime StringToDate(String timeString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'");
        LocalDateTime dateTime = LocalDateTime.parse(timeString, formatter);   
        return dateTime;
    }


    
    
    
    
   



}
