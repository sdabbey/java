//Samuel Desmond Abbey Darko -- 3359322
import java.util.Scanner;

public class Main {
    public static void main (String []args ){
        Scanner input = new Scanner (System.in);
        double numArr [][] = new double[3][3];
        
        double product_LD, product_TD, difference, sum, average, summation, standard_dev;
        sum = summation = 0;
        int element_number = 0;
        for (int a = 0; a < numArr.length; a++) {
            System.out.println("Row  " + (1+a));
            for(int b=0; b<numArr[a].length; b++){
                System.out.println("Enter individual values for this row:");
                double tempInput = input.nextDouble();
                if(tempInput%2!=0 && tempInput > 0){
                    numArr[a][b]=tempInput;
                    
                    element_number +=1;
                }else{
                    System.out.println("Please enter an odd number!");
                    b--;
                
                }   
                
            }
            System.out.println("\n");
        }

        product_LD = numArr[0][0] * numArr[1][1] * numArr[2][2];
        product_TD = numArr[0][2] * numArr[1][1] * numArr[2][0];
        difference = product_TD - product_LD;
        numArr[1][1] = difference;
        numArr[0][1] = product_LD;
        numArr[2][1] = product_TD;
        
        //Calculating Average(Mean)
        for (int q = 0; q < numArr.length; q++) {
            for (int r = 0; r < numArr[q].length; r++) {
                sum += numArr[q][r];
            }
        }
        average = sum / element_number;


       

        //Mean Deviation Calculation
        for(int c = 0; c<numArr.length; c++){
            for (int d = 0; d < numArr[c].length; d++) {
                summation += (Math.pow(numArr[c][d] - average, 2));
            }
        }
        
        //Standard Deviation
        standard_dev = Math.sqrt(summation/element_number);

        numArr[1][0] = average;
        numArr[1][2] = Math.round(standard_dev * 100)/100;
        

        //Sorting Array Elements in Descending order
        int rows = numArr.length;
        int cols = numArr[0].length;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 1; j++) {
                for (int k = 0; k < cols - j - 1; k++) {
                    if (numArr[i][k] < numArr[i][k + 1]) {
                        // Swap elements if they are in the wrong order
                        double temp = numArr[i][k];
                        numArr[i][k] = numArr[i][k + 1];
                        numArr[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Average:" + average);
        System.out.println("Standard Deviation:" + standard_dev + "\n");

        System.out.println("Final 2D 3x3 Array:" + "\n");

        //Print Array in Descending 
        for (double[] row : numArr) {
            for (double value : row) {
                System.out.print(value + "\t" + " ");
            }
            System.out.println();
        }

        input.close();
    }


    
}
