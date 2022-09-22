package training.busboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
    public class StopPoints {

        private String naptanId;

        public String getNaptanId() {
            return naptanId;
        }

        public void setNaptanId(String naptanId) {
            this.naptanId = naptanId;
        }



        public StopPoints() {

        }


    }
