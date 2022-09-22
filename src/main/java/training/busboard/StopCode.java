package training.busboard;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class StopCode {

    public StopCode(){
        
    }

   private List<StopPoints> stopPoints;

       
        public List<StopPoints> getStopPoints() {
            return stopPoints;
        }

        public void setStopPoints(List<StopPoints> stopPoints) {
            this.stopPoints = stopPoints;
        }
    
}
