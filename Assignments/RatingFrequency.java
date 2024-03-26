package assignment;
import java.util.Scanner;

public class RatingFrequency {
    public static void main(String[] args) {
    

        int [] responses = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rating value(1-5): ");
        for(int j = 0; j<responses.length; j++){
            int temp_input = input.nextInt();
            if (temp_input < 1 || temp_input > 5) {
                System.out.println("Enter valid rating value: ");
                j--;
                continue;
            }
            responses[j] = temp_input;
            System.out.println("Enter next rating value: ");
        }
        
        int v1f, v2f, v3f, v4f, v5f;
        v1f=v2f=v3f=v4f=v5f= 0;

     
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
     
 
 