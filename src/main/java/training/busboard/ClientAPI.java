package training.busboard;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.jackson.JacksonFeature;

public class ClientAPI {
    String bustop = "490008660N";
    Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
    WebTarget webTarget = client.target("https://api.tfl.gov.uk/StopPoint/id/Arrivals");
    WebTarget webtargetwithparam = webTarget.queryParam("id", bustop);
    Invocation.Builder invocationBuilder = webtargetwithparam.request(MediaType.APPLICATION_JSON).get
    
    // Response response = invocationBuilder.get();
    // public String getResponse() {return response.toString();}
}
