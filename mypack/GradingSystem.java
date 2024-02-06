package mypack;
import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        System.out.println("Enter class size:");
        Scanner sizeInput = new Scanner(System.in);
        int classSize = sizeInput.nextInt();

        System.out.println("Enter student details in the format; Name, Index Number and Score");

        String [] studentNames = new String[classSize];
        Double [] studentScore = new Double[classSize];
        int [] studentIndexNumber = new int[classSize];
        char [] studentGrade = new char[classSize];

        Scanner detailInput = new Scanner(System.in); 

        for(int i=0; i<classSize; i++){
            System.out.print("Enter the student name: ");
            studentNames[i] = detailInput.next();

            System.out.print("Enter the student index number: ");
            studentIndexNumber[i] = detailInput.nextInt();

            System.out.print("Enter the student score: ");
            studentScore[i] = detailInput.nextDouble();

            double score = studentScore[i];
            if(score >= 70){
                studentGrade[i] = 'A';
            }
            else if(score >=60){
                studentGrade[i] = 'B';
            }
            else if(score >=55){
                studentGrade[i] = 'C';
            }
            else if(score >=50){
                studentGrade[i] = 'D';
            }
            else if(score >=40){
                studentGrade[i] = 'E';
            }
            else{
                studentGrade[i] = 'F';
            }
            
            System.out.println("\n");
            
            
        }
        
        System.out.println("Student Math Test Results: ");
        for(int j=0; j<classSize; j++){
            System.out.println(studentNames[j] + " with index number " + studentIndexNumber[j] + " got grade " + studentGrade[j]);
            System.out.println("\n");
        }

        sizeInput.close();
        detailInput.close();
    }
}
