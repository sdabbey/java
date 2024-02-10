import java.util.Scanner;

public class RatingFrequency {
    public static void main(String[] args) {
     //int [] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};

     int [] responses = new int[20];
     Scanner input = new Scanner(System.in);
     System.out.println("Enter rating value: ");
     for(int j = 0; j<responses.length; j++){

        responses[j] = input.nextInt();
        System.out.println("Enter next rating value: ");
     }
     
     int v1f = 0;
     int v2f = 0;
     int v3f = 0;
     int v4f = 0;
     int v5f = 0;

     
     for(int i=0; i<responses.length; i++){
        if(responses[i] == 1){
            v1f += 1;
        }else if(responses[i] == 2){
            v2f += 1;
        }else if(responses[i] == 3){
            v3f += 1;
        }else if(responses[i] == 4){
            v4f += 1;
        }else{
            v5f += 1;
        }
     }

        System.out.println("Rating results with frequencies:" + "\n");
        System.out.println("Frequency of 1 is " + v1f);
        System.out.println("Frequency of 2 is " + v2f);
        System.out.println("Frequency of 3 is " + v3f);
        System.out.println("Frequency of 4 is " + v4f);
        System.out.println("Frequency of 5 is " + v5f);

        input.close();
     
    }
 
}
     
 
 