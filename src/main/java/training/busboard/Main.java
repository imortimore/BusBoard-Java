package training.busboard;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Main {
    public static void main(String args[]) {

ClientAPI test = new ClientAPI();
for (int i=0 ; i < 5 ; i++){
    System.out.print(ClientAPI.getresponse().get(i).getLineId()+" ");
    System.out.println(ClientAPI.getresponse().get(i).getDestinationName());
}
    }
}	
