import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentInfoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> studentPhoneNumbers = new HashMap<>();
        HashMap<Integer, Integer> holidayRatings = new HashMap<>();

        try {
            while (true) {
                System.out.print("Enter student's name (or 'z' to finish): ");
                String name = scanner.nextLine().trim();
                if (name.equalsIgnoreCase("z")) {
                    break;
                }

                System.out.print("Enter student's phone number: ");
                String phoneNumber = scanner.nextLine().trim();
                
                System.out.print("Enter student's holiday destination rating (1-7): ");
                int rating = Integer.parseInt(scanner.nextLine().trim());
                
                // Validate the rating
                if (rating < 1 || rating > 7) {
                    throw new IllegalArgumentException("Invalid rating. Please enter a rating between 1 and 7.");
                }

                // Store student's information
                studentPhoneNumbers.put(name, phoneNumber);
                holidayRatings.put(rating, holidayRatings.getOrDefault(rating, 0) + 1);
            }

            // Display count of students' names and phone numbers
            System.out.println("\nTotal number of students entered: " + studentPhoneNumbers.size());

            // Display count of holiday destination ratings
            System.out.println("\nFrequency of occurrence of each holiday destination rating:");
            for (Map.Entry<Integer, Integer> entry : holidayRatings.entrySet()) {
                System.out.println("Rating " + entry.getKey() + ": " + entry.getValue() + " times");
            }

            // Display holiday destination ratings in descending order
            System.out.println("\nHoliday destination ratings in descending order:");
            holidayRatings.entrySet().stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(entry -> System.out.println("Rating " + entry.getKey() + ": " + entry.getValue() + " times"));

            // Display corresponding phone number and rating for each student
            for (Map.Entry<String, String> entry : studentPhoneNumbers.entrySet()) {
                System.out.println("Student: " + entry.getKey() + ", Phone Number: " + entry.getValue() +
                        ", Holiday Destination Rating: " + getRatingForStudent(entry.getKey(), studentPhoneNumbers, holidayRatings));
            }

        } catch (NumberFormatException e) {
            System.err.println("Invalid input for rating. Please enter a valid integer between 1 and 7.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int getRatingForStudent(String studentName, Map<String, String> studentPhoneNumbers, Map<Integer, Integer> holidayRatings) {
        for (Map.Entry<String, String> entry : studentPhoneNumbers.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(studentName)) {
                String phoneNumber = entry.getValue();
                for (Map.Entry<Integer, Integer> ratingEntry : holidayRatings.entrySet()) {
                    if (ratingEntry.getValue() == Integer.parseInt(phoneNumber)) {
                        return ratingEntry.getKey();
                    }
                }
            }
        }
        return -1; // Rating not found
    }
}
