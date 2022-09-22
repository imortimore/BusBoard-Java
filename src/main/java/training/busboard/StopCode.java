package training.busboard;

import java.util.List;

public class StopCode {

    StopPoints stopPoints = new StopPoints();

    public StopPoints getStopPoints() {
        return stopPoints;
    }

    public void setStopPoints(StopPoints stopPoints) {
        this.stopPoints = stopPoints;
    }

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
