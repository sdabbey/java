// Caleb Gyamera Charles - 3392822
package assignment;
import java.util.Arrays;
import java.util.Scanner;


public class Standard_deviation {
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
            integer_array[i] = inputValue;
            System.out.println("Enter the next even integer: ");
        }
        
        System.out.println("List Of First Even Integers between 0 and 20 : ");
        System.out.println((Arrays.toString(integer_array)));
        System.out.print("\n" );


        //Standard Deviation Calculation

        double standardDev, mean,  sumDeviation;
        int sum = 0;
        for(int j=0; j<integer_array.length; j++){
            sum = sum + integer_array[j];
        }
        //Mean Calculation
        mean =  (sum / integer_array.length);
        sumDeviation = 0;

        //Mean Deviation Calculation
        for(int k=0; k<integer_array.length; k++){
            sumDeviation +=  (Math.pow(integer_array[k] - mean, 2));
        }

        standardDev = Math.sqrt(sumDeviation/integer_array.length);


        System.out.println("\n");
        System.out.println("Standard deviation of the 10 integers is  " + standardDev);

        System.out.println("\n");
        input.close();
    }

}
