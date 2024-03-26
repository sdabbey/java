package Assignments.code9;
import java.util.Scanner;
public class InputClass {
    int classSize;
    String [] studentName;
    int [] studentIndexNumber;
    int [] studentScore;

    public void myInput(){
        System.out.println("Enter class size:");
        Scanner input = new Scanner(System.in);

        classSize = input.nextInt();

        System.out.println("Enter Student details in the fields below");

        studentName = new String[classSize];
        studentIndexNumber = new int[classSize];
        studentScore = new int[classSize];

        for(int i = 0; i<classSize; i++){
            System.out.print("Enter student name: ");
            studentName[i] = input.next();

            System.out.print("Enter student index number: ");
            studentIndexNumber[i] = input.nextInt();

            System.out.print("Enter student score: ");
            studentScore[i] = input.nextInt();

            System.out.println("\n");
        }

        input.close();
        

    }    
}
