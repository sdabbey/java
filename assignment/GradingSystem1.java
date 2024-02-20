package assignment;                       
import java.util.Scanner;
public class GradingSystem1 {
    Boolean pass_req_one = false;
    Boolean pass_req_two = false;
    Boolean paid_full_fees = false;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GradingSystem1 mainObj = new GradingSystem1();

        // Reading in Student Assessment and Exam Score
        System.out.println("Enter Student Exam Score: ");
        Double exam_score = input.nextDouble();

        System.out.println("Enter Student Assessment Score: ");
        Double assessment_score = input.nextDouble();

        System.out.println("Enter Amount of Fees paid(0-100): ");
        Double fee_amount = input.nextDouble();


        Double total_score = exam_score + assessment_score;

        //Condition for Fee Status
        if(fee_amount == 100){
            mainObj.paid_full_fees = true;
        }

        //Condition for Requirement One
        if(exam_score >= 25 && assessment_score >= 15){
            mainObj.pass_req_one = true;
            System.out.println("Student has passed the exam component.");
            System.out.println("Student has passed the assessment component.");
        }

        //Condition for Requirement Two
        if(total_score == 39){
            if(exam_score == 25 && assessment_score == 14){
                mainObj.pass_req_two = true;
                System.out.println("Student has passed the exam component.");
                System.out.println("Student has failed the assessment component.");
            }else if(exam_score == 24 && assessment_score == 15){
                mainObj.pass_req_two = true;
                System.out.println("Student has failed the exam component.");
                System.out.println("Student has passed the assessment component.");
            }
        }

       
        if((mainObj.pass_req_one || mainObj.pass_req_two)){

            if(mainObj.paid_full_fees){
                System.out.println("Student has passed and deserves a certificate.");
               
            }else{
                System.out.println("Student has passed but has not paid fees in full.");
            }
            
        }else{
            if(exam_score >= 25){
                System.out.println("Student has passed the exam component.");
            }else{
                System.out.println("Student has failed the exam component.");
            }
            if(assessment_score >= 15){
                System.out.println("Student has passed the assessment component.");
            }else{
                System.out.println("Student has failed the assessment component.");
            }
            System.out.println("Student has failed and is to be repeated.");
        }
        
        input.close();


    }

    
}

