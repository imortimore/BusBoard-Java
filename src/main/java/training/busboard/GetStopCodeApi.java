package training.busboard;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import training.busboard.Result.nameCoord;

import java.util.ArrayList;
import java.util.List;

import org.glassfish.jersey.jackson.JacksonFeature;

public class GetStopCodeApi {

    

    public String stopType = "NaptanPublicBusCoachTram";
    
    private StopCode stopCodeResponselist = new StopCode();

    public StopCode getstopCodeResponselist(){
        return stopCodeResponselist;
    } 

    public void makeRequest(nameCoord coordobj){

    Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
    WebTarget webTarget = client.target("https://api.tfl.gov.uk/StopPoint/lat&lon&stopTypes");
    WebTarget webtargetwithparam = webTarget.queryParam("lat", coordobj.getlatitude());
    webtargetwithparam.queryParam("lon", coordobj.getlongitude());
    webtargetwithparam.queryParam("stopTypes", stopType);
    System.out.println(webtargetwithparam);
    stopCodeResponselist = webtargetwithparam.request(MediaType.APPLICATION_JSON)
    .get (StopCode.class);

   
    }

    
    
    
    //String bustop = "490008660N";
    
}
