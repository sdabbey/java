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
        
        for (int i = 0; i < class_size; i++) {
            try {
               
                System.out.println("Enter Student Name: ");
                name[i] = input.next();
    
                System.out.println("Enter Phone Number: ");
                phone_number[i] = input.next();
    
                System.out.println("Enter Holiday Destination Rating: ");
                hdrating[i] = input.nextInt();
            }
            catch (InputMismatchException e) {
                char exitChar = e.getMessage().charAt(0);
                if(exitChar=='z'){
                    System.out.println("Character 'z' has been entered. Exiting now...");
                    break;
                };
            }
        }
       

        input.close();

    }
}
