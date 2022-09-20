package training.busboard;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.jackson.JacksonFeature;

public class ClientAPI {
    Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
    WebTarget webTarget = client.target("https://api.tfl.gov.uk/StopPoint/490008660N/Arrivals");
    Invocation.Builder invocationbuilder = webTarget.request(MediaType.APPLICATION_JSON);
    Response response = invocationbuilder.get();
    public Response getResponse() {return response;}
}
