package training.busboard;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Main {
    public static void main(String args[]) {

ClientAPI test = new ClientAPI();

        System.out.println(BustopResponse.StringToDate(ClientAPI.getresponse().get(1).getTimeStamp()));

//System.out.println(ClientAPI.getresponse().get(1).getid());
        // Your code here!

    }
}	
