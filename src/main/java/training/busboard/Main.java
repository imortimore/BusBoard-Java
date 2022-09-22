package training.busboard;

import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter postcode");
        String postCode = sc.nextLine(); 
        System.out.println(postCode);
        PostcodeAPI postCodeResponse = new PostcodeAPI(postCode);
        postCodeResponse.makeRequest();
        System.out.print(postCodeResponse.getPostCodeResponse().getResultlatitude());


// ClientAPI busResponse = new ClientAPI(busStop);
// busResponse.makeRequest();
// for (int i=0 ; i < 5 ; i++){
//     System.out.print(busResponse.getBustopResponselist().get(i).getLineId()+" ");
//     System.out.println(busResponse.getBustopResponselist().get(i).getDestinationName());
// }
//     }

    }
}
