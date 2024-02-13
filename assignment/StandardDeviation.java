// Winifred Anokye - 3359322
package assignment;
import java.util.Scanner;  
import java.util.Arrays;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] integer_array = new int[10];
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
            integer_array[i] = inputValue;
            
        }
        
        System.out.println("List Of First Even Integers between 0 and 20 : " + "\n");
        System.out.println(Arrays.toString(integer_array));
        System.out.print("\n" );


        //Standard Deviation Calculation

        double standardDev, mean,  summation;
        int sum = 0;
        for(int j=0; j<integer_array.length; j++){
            sum = sum + integer_array[j];
        }
        //Mean Calculation
        mean =  (sum / integer_array.length);
        summation = 0;

        //Mean Deviation Calculation
        for(int k=0; k<integer_array.length; k++){
            summation +=  (Math.pow(integer_array[k] - mean, 2));
        }

        standardDev = Math.sqrt(summation/integer_array.length);


        System.out.println("\n");
        System.out.println("Standard deviation of the 10 integers is  " + standardDev);

        System.out.println("\n");
        input.close();
    }

}
