package training.busboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result{
    //constructor
    public Result(){
    }
    //linking result to Coords
    private Coords resultcoords = new Coords();
    public Coords getResultcoords() {
        return resultcoords;
    }
    public void setResultcoords(Coords resultcoords) {
        this.resultcoords = resultcoords;
    }




    


    


    









}
