import java.util.InputMismatchException;
import java.util.Scanner;
public class MidsemAssignment {
    public static void main(String[] args) {
        //Instantiate Scanner class
        
        
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
