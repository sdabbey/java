package Assignments.code8;
// Samuel Desmond Abbey Darko -- 3359322
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
public class MidsemAssignment {
    public static void main(String[] args) {
        //Instantiate Scanner class
        Scanner input = new Scanner(System.in);
        
        

        //Declare and Initialize variables
        HashMap<String, String> studentDetail = new HashMap<>(); //Contains Names and Corresponding phone_number
        HashMap<String, Integer> studentRating = new HashMap<>(); //Contains phone_number as key corresponding to Rating.
        HashMap<Integer, Integer> holidayRatingFrequency = new HashMap<>(); //Contains Holiday rating with corresponding frequency

        

        System.out.println("Fill in individual student detail below: ");
        
        
        
        while (true) {
                try {
                    System.out.print("Enter student's name: ");
                    String name = input.nextLine().trim();
                    
                    if (name.matches(".*\\d.*")) {
                        throw new InputMismatchException("Name cannot contain digits!");
                    }

                    System.out.print("Enter student's phone number: ");
                    String phone_number = input.nextLine().trim();

                    if (phone_number.matches(".*[a-zA-Z]+.*")) {
                        throw new InputMismatchException("Phone number cannot contain letters!");
                    }

                    if (studentDetail.containsValue(phone_number)) {
            
                        if (studentDetail.containsKey(name)) {
                            System.out.println("Student already exists!(Please re-enter the details for a new student.)");
                            continue; // Continue to the next iteration of the loop
                        }
                        System.out.println("Phone number already exists!(Please re-enter a valid phonenumber for this student.)");
                        System.out.print("Enter new phone number: ");
                        phone_number = input.nextLine().trim();
                    }

                
                    // Validate rating value
                    int rating;
                    while (true) {
                        System.out.print("Enter student's holiday destination rating (1-7): ");
                        try {
                            rating = Integer.parseInt(input.nextLine().trim());
                            if (rating < 1 || rating > 7) {
                                System.out.println("Error: Rating out of range! Please enter a rating between 1 and 7.");
                                continue; // Continue to the next iteration of the loop
                            }
                            break; // Exit the loop if rating is valid
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Please enter a valid number.");
                        }
                    }

                    // Store student's information
                    studentDetail.put(name, phone_number);
                    studentRating.put(phone_number, rating);
                    holidayRatingFrequency.put(rating, holidayRatingFrequency.getOrDefault(rating, 0) + 1);

                    // Prompts user to finish or continue
                    System.out.print("Enter any key to continue (or 'z' to finish): ");
                    String prompt = input.nextLine().trim();
                    if (prompt.equalsIgnoreCase("z")) {
                        break;
                    }

                    System.out.println();
                }catch (InputMismatchException e) {
                    System.out.println("Error: " + e.getMessage());
                }catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                }

        }
            // Displays count of student details entered
            System.out.println("\nTotal number of students entered: " + studentDetail.size());

            // Displays count of frequency of occurrence of each holiday rating
            System.out.println("\nFrequency of occurrence of each holiday destination rating:");
            for (int rating : holidayRatingFrequency.keySet()) {
                System.out.println("Rating " + rating + ": " + holidayRatingFrequency.get(rating) + " times");
            }

            // Displays holiday destination ratings in descending order
            System.out.println("\n" + "Holiday destination ratings in descending order: ");
            holidayRatingFrequency.entrySet().stream()
                    .sorted((value1, value2) -> Integer.compare(value2.getValue(), value1.getValue()))
                    .forEach(entry -> System.out.println("Rating " + entry.getKey() + ": " + entry.getValue() + " times"));

            

            // Student Detail Referencing with names.
            System.out.println("\nSTUDENT QUERY SYSTEM");
            while (true) {
                
                System.out.print("Enter student's name to display details (or 'E' to exit): ");
                String queryName = input.nextLine().trim();
                
                boolean found = false;
                for (HashMap.Entry<String, String> entry : studentDetail.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(queryName)) {
                
                        System.out.println("\nDETAILS:");
                        System.out.println("Name: " + entry.getKey() + "\n" + "Phone Number: " + studentDetail.get(entry.getKey()) + "\n" + "Holiday Rating: " + studentRating.get(studentDetail.get(entry.getKey())) + "\n");
                        found = true;
                        break;
                    }
                    
                }
                if(!found){
                    if (!queryName.equalsIgnoreCase("e")) {
                        System.out.println("Sorry!, no student by that name available.");
                    }
                    
                    
                }
                if (queryName.equalsIgnoreCase("e")) {
                    break;
                }
            }
            

        

        input.close();
    }

}
