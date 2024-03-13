//Anokye Winifred - 3371822
import java.util.HashMap;
import java.util.Map;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInfo {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        

        //Declare and Initialize variables
        Map<String, Integer> Individual_Rating = new HashMap<>();
        Map<String, String> Student_Detail = new HashMap<>(); 
        Map<Integer, Integer> Rating_Frequency = new HashMap<>();

        System.out.println("Student Details Form");
        
        
        
        while (true) {
            try {
                System.out.print("Enter student's name: ");
                String name = input.nextLine();
                
                if (name.matches(".*\\d.*")) {
                    throw new InputMismatchException("Name cannot contain digits!");
                }

                System.out.print("Enter student's phone number: ");
                String phonenumber = input.nextLine();

                if (phonenumber.matches(".*[a-zA-Z]+.*")) {
                    throw new InputMismatchException("Phone number cannot contain letters!");
                }

                if (Student_Detail.containsValue(phonenumber)) {
        
                    if (Student_Detail.containsKey(name)) {
                        System.out.println("Student already exists!");
                        continue; 
                    }
                    System.out.println("Phone number already exists!");
                    System.out.print("Enter new phone number: ");
                    phonenumber = input.nextLine();
                }

            
                // Validate rating value
                int rating;
                while (true) {
                    System.out.print("Enter student's holiday destination rating (1-7): ");
                    try {
                        rating = Integer.parseInt(input.nextLine());
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
                Student_Detail.put(name, phonenumber);
                Individual_Rating.put(phonenumber, rating);
                Rating_Frequency.put(rating, Rating_Frequency.getOrDefault(rating, 0) + 1);

                // Prompts user to finish or continue
                System.out.print("Enter any key to continue (or 'z' to finish): ");
                String prompt = input.nextLine();
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
        System.out.println("Total number of students entered: " + Student_Detail.size());

        // Displays count of frequency of holiday destination rating
        System.out.println("Frequency of occurrence of each holiday destination rating:");
        for (int rating : Rating_Frequency.keySet()) {
            System.out.println("Rating " + rating + ": " + Rating_Frequency.get(rating) + " times");
        }

        // Displays holiday destination ratings in descending order
        System.out.println("\n" + "Holiday destination ratings in descending order: ");
        Rating_Frequency.entrySet().stream()
                .sorted((value1, value2) -> Integer.compare(value2.getValue(), value1.getValue()))
                .forEach(entry -> System.out.println("Rating " + entry.getKey() + ": " + entry.getValue() + " times"));

        

        while (true) {
            
            System.out.print("Enter student's name to display details (or 'E' to exit): ");
            String queryName = input.nextLine();
            
            boolean found = false;
            for (HashMap.Entry<String, String> entry : Student_Detail.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(queryName)) {
            
                    System.out.println("Student Details:");
                    System.out.println("Name: " + entry.getKey() + "\n" + "Phone Number: " + Student_Detail.get(entry.getKey()) + "\n" + "Holiday Rating: " + Individual_Rating.get(Student_Detail.get(entry.getKey())) + "\n");
                    found = true;
                    break;
                }
                
            }
            if(!found){
                if (!queryName.equalsIgnoreCase("e")) {
                    System.out.println("Sorry, student not found");
                }
                
                
            }
            if (queryName.equalsIgnoreCase("e")) {
                break;
            }
        }
            

        

        input.close();
    }

}
