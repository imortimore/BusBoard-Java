package training.busboard;
import com.google.gson.Gson;

import jakarta.ws.rs.core.Response;

public class jsonHandler {

    
    public static  void objFromJson(Response response){

   BusTimetable busTimetable = new Gson().fromJson( response ,BusTimetable.class);


    }


    
}
