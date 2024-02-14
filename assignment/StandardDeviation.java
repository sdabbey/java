 Samuel Desmond Abbey Darko - 3359322
package assignment;
import java.util.Scanner;  
import java.util.Arrays;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] intArray = new int[10];
        System.out.println("\n");
        System.out.println("Enter Even Integers between 0 and 20(excluding 0): ");
        
        int i;

        
        for(i=0; i<10; i++){
            int inputValue = input.nextInt();
           
            if (inputValue % 2 != 0 || inputValue > 20 || inputValue < 1) {
                if (inputValue % 2 != 0) {
                    System.out.println("Enter an even integer: ");
                    i--;
                    continue;
                }
                if (inputValue > 20 || inputValue < 1) {
                    System.out.println("Enter an even integer between 1 and 20 inclusive: ");
                    i--;
                    continue;
                }
                
                
            }
            System.out.println("Enter the next even integer: ");
            intArray[i] = inputValue;
            
        }
        
        input.close();
        
        System.out.println("List Of First Even Integers between 0 and 20 : " + "\n");
        System.out.println(Arrays.toString(intArray));
        System.out.print("\n" );


        //Standard Deviation Calculation

        double standardDev, mean,  summation;
        int sum = 0;
        for(int j=0; j<intArray.length; j++){
            sum = sum + intArray[j];
        }
        //Mean Calculation
        mean =  (sum / intArray.length);
        summation = 0;

        //Mean Deviation Calculation
        for(int k=0; k<intArray.length; k++){
            summation +=  (Math.pow(intArray[k] - mean, 2));
        }

        standardDev = Math.sqrt(summation/intArray.length);


        System.out.println("\n");
        System.out.println("Standard deviation of the 10 integers is  " + standardDev);

        System.out.println("\n");
        
    }

}
