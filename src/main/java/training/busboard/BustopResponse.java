package training.busboard;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.ws.rs.core.Response;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BustopResponse {
    private String id;

    public BustopResponse(){
    }

    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id = id;
    }



}
