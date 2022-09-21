package training.busboard;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.ws.rs.core.Response;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BustopResponse {
    private String id;
    private String stationName;
    private String lineId;
    private String destinationName;
    private Integer timeToStation;
    private LocalDateTime timestamp;
    private LocalDateTime expectedArrival;



    public BustopResponse(){
    }

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
    public LocalDateTime getTimeStamp(){
        return timestamp;
    }
    public LocalDateTime getExpectedArrival(){
        return expectedArrival;
    }



    
    
    
    
    public void setid(String id){
        this.id = id;
    }



}
