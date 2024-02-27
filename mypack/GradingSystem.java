//Grading System
package mypack;
import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        System.out.println("Enter class size:");
        Scanner input = new Scanner(System.in);
        int classSize = input.nextInt();

        System.out.println("Enter student details in the format; Name, Index Number and Score");

        String [] studentNames = new String[classSize];
        Double [] studentScores = new Double[classSize];
        int [] studentIndexNumbers = new int[classSize];
        char [] studentGrades = new char[classSize];

         

        for(int i=0; i<classSize; i++){
            System.out.print("Enter the student name: ");
            studentNames[i] = input.next();

            System.out.print("Enter the student index number: ");
            studentIndexNumbers[i] = input.nextInt();

            System.out.print("Enter the student score: ");
            studentScores[i] = input.nextDouble();

            double score = studentScores[i];
            if(score >= 70){
                studentGrades[i] = 'A';
            }
            else if(score >=60){
                studentGrades[i] = 'B';
            }
            else if(score >=55){
                studentGrades[i] = 'C';
            }
            else if(score >=50){
                studentGrades[i] = 'D';
            }
            else if(score >=40){
                studentGrades[i] = 'E';
            }
            else{
                studentGrades[i] = 'F';
            }
            
            System.out.println("\n");
            
            
        }
        
        System.out.println("Student Math Test Results: ");
        for(int j=0; j<classSize; j++){
            System.out.println(studentNames[j] + " with index number " + studentIndexNumbers[j] + " got grade " + studentGrades[j]);
            System.out.println("\n");
        }

        input.close();
       
    }
}
