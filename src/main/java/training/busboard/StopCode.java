package training.busboard;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class StopCode {

    StopPoints stopPoints = new StopPoints();

    public StopPoints getStopPoints() {
        return stopPoints;
    }

    public void setStopPoints(StopPoints stopPoints) {
        this.stopPoints = stopPoints;
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class StopPoints {

        List<Object> list;

        public List<Object> getList() {
            return list;
        }

        public void setList(List<Object> list) {
            this.list = list;
        }

        public StopPoints() {

        }


    }
}
