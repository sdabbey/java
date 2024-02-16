// Siaw Emmanuel Asante -- 3414422

import java.util.Scanner;



public class GradingSystem {
    public static void main(String[] args) {
        // Instantiate the Scanner class
        Scanner input = new Scanner(System.in);

        //Declaring array variables
        int [] indexNumbers,  midsemScores, examScores;
        
        System.out.println("Enter Class Size: ");
        int class_size = input.nextInt();
        double average_score, total_scores;
        total_scores = 0;

        indexNumbers = new int[class_size];
        examScores = new int[class_size];
        midsemScores = new int[class_size];
        double [] finalScores = new double[class_size];
        char [] grades = new char[class_size];
        
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        int Afr, Bfr, Cfr, Dfr, Efr, Ffr;
        Afr=Bfr=Cfr=Dfr=Efr=Ffr=0;
        for (int i = 0; i < class_size; i++) {
            System.out.println("Enter the Student Index Number: ");
            indexNumbers[i] = input.nextInt();
            
            System.out.println("Enter the Student Mid-Semester Score: ");
            midsemScores[i] = input.nextInt();

            System.out.println("Enter the Student Exam Score: ");
            examScores[i] = input.nextInt();

            
            // Condition for Grade Calculation
            double scaled_midsem, scaled_exam;
            
            scaled_midsem = 0.3 * midsemScores[i];
            scaled_exam = 0.7 * examScores[i];

            finalScores[i] = scaled_midsem + scaled_exam;
            total_scores+=finalScores[i];



            
            if(finalScores[i] >= 70){
                grades[i] = 'A';
            }
            else if(finalScores[i] >=60){
                grades[i] = 'B';
            }
            else if(finalScores[i] >=55){
                grades[i] = 'C';
            }
            else if(finalScores[i] >=50){
                grades[i] = 'D';
            }
            else if(finalScores[i] >=40){
                grades[i] = 'E';
            }
            else{
                grades[i] = 'F';
            }
            
            //Min value
            if(finalScores[i] < min){
                min = finalScores[i];
            }

            //Max value
            if(finalScores[i] > max){
                max = finalScores[i];
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
            System.out.printf("|%-10s|%-11s|%-5s|%n", indexNumbers[k], finalScores[k], grades[k]);
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
