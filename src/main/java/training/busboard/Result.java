package training.busboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result{
    private Integer status;
    public nameCoord result = new nameCoord() ;
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    //constructor
    public Result(){
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    public class nameCoord {

        //fields
        private String latitude;
        private String longitude;
        //constructors

        public nameCoord() {    
        }
        //getters
        public String getlatitude() {
            return latitude;
        }
        public String getlongitude() {
            return longitude;
        }
        //setters
        public void setlatitude(String latitude) {
            this.latitude = latitude;
        }
        public void setlongitude(String longitude) {
            this.longitude = longitude;
        }
    }
    

    
   
    }
    //linking result to Coords
    // private Coords resultcoords = new Coords();
    
    
    
    // public Coords getResultcoords() {
    //     return resultcoords;
    // }
    // public void setResultcoords(Coords resultcoords) {
    //     this.resultcoords = resultcoords;
    // }




    


    


    










