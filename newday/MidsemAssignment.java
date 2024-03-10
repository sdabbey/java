import java.util.InputMismatchException;
import java.util.Scanner;
public class MidsemAssignment {
    public static void main(String[] args) {
        //Instantiate Scanner class
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of students: ");
        int class_size = input.nextInt();

        //Declare and Initialize variables
        String name [] = new String[class_size];
        String phone_number [] = new String[class_size];
        int hdrating [] = new int[class_size];

        System.out.println("Fill in individual student detail below: ");
        
    
       

        input.close();

    }
}
