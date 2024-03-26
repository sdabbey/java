// Samuel Desmond Abbey Darko -- 3359322

//Grading System of a whole class(with class size specification)
package Assignments;
import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        // Instantiate the Scanner class
        Scanner input = new Scanner(System.in);

        //Declaring array variables
        int [] index_numbers,  midsem_scores, exam_scores;
        
        System.out.println("Enter Class Size: ");
        int class_size = input.nextInt();
        double average_score, total_scores;
        total_scores = 0;

        index_numbers = new int[class_size];
        exam_scores = new int[class_size];
        midsem_scores = new int[class_size];
        double [] final_scores = new double[class_size];
        char [] grades = new char[class_size];
        
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        int Afr, Bfr, Cfr, Dfr, Efr, Ffr;
        Afr=Bfr=Cfr=Dfr=Efr=Ffr=0;
        for (int i = 0; i < class_size; i++) {
            System.out.println("Enter the Student Index Number: ");
            index_numbers[i] = input.nextInt();
            
            System.out.println("Enter the Student Mid-Semester Score: ");
            midsem_scores[i] = input.nextInt();

            System.out.println("Enter the Student Exam Score: ");
            exam_scores[i] = input.nextInt();

            
            // Condition for Grade Calculation
            double scaled_midsem, scaled_exam;
            
            scaled_midsem = 0.3 * midsem_scores[i];
            scaled_exam = 0.7 * exam_scores[i];

            final_scores[i] = scaled_midsem + scaled_exam;
            total_scores+=final_scores[i];



            
            if(final_scores[i] >= 70){
                grades[i] = 'A';
            }
            else if(final_scores[i] >=60){
                grades[i] = 'B';
            }
            else if(final_scores[i] >=55){
                grades[i] = 'C';
            }
            else if(final_scores[i] >=50){
                grades[i] = 'D';
            }
            else if(final_scores[i] >=40){
                grades[i] = 'E';
            }
            else{
                grades[i] = 'F';
            }
            
            //Min value
            if(final_scores[i] < min){
                min = final_scores[i];
            }

            //Max value
            if(final_scores[i] > max){
                max = final_scores[i];
            }

            
          
            
           
            // Grade Frequency Calculation
            
        
            if(grades[i] == 'A'){
                Afr += 1;
            }else if(grades[i] == 'B'){
                Bfr += 1;
            }else if(grades[i] == 'C'){
                Cfr += 1;
            }else if(grades[i] == 'D'){
                Dfr += 1;
            }else if(grades[i] == 'E'){
                Efr += 1;
            }else {
                Ffr += 1;
            }

            
        }
        
       
       
        // Average Score Calculation
        average_score = total_scores / class_size;



        
        
        System.out.println("\n");
        System.out.printf("|%-10s|%-10s|%-5s|%n", "Index No.", "Final Score", "Grade");

        System.out.println("------------------------------");
        for (int k = 0; k < class_size; k++) {
            System.out.printf("|%-10s|%-11s|%-5s|%n", index_numbers[k], final_scores[k], grades[k]);
        }

        System.out.println("\n");
        System.out.println("The average score is " + average_score);
        System.out.println("The maximum score is " + max);
        System.out.println("The minimum score is " + min);
        
        System.out.println("\n");
        System.out.println("Grades with frequencies:" + "\n");
        System.out.println("Grade A had frequency of " + Afr);
        System.out.println("Grade B had frequency of " + Bfr);
        System.out.println("Grade C had frequency of " + Cfr);
        System.out.println("Grade D had frequency of " + Dfr);
        System.out.println("Grade E had frequency of " + Efr);
        System.out.println("Grade F had frequency of " + Ffr);
        
        input.close();
    }
}
