package mypack;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if(isPrime(number)){
            System.out.println(number + " " + "is a prime number");
        }else{
            System.out.println(number + " " + "is not a prime number");
        }

        scanner.close();
    }

    private static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i=2; i <= num/2; i++){
            if(num % i == 0){
                return false; 
            }
        }

        return true;
    }
}
