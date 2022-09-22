package training.busboard;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

import org.glassfish.jersey.jackson.JacksonFeature;

public class PostcodeAPI {
    private String postCode;

    public PostcodeAPI(String postCode) {
        this.postCode = postCode;
    }
    private Coords postCodeResponse;
    
    public Coords getPostCodeResponse() {
        return postCodeResponse;
    }

    public void makeRequest(){
        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        WebTarget webTarget = client.target("https://api.postcodes.io/postcodes/");
        WebTarget webtargetwithparam = webTarget.path(postCode);
        System.out.println(webtargetwithparam);
        postCodeResponse = webtargetwithparam.request(MediaType.APPLICATION_JSON)
        .get ( new GenericType<Coords> (){});
        
        }
        


    












}