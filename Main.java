//import java.util.Scanner;

public class Main{
    
    /*
    static int addNumbers(int x, int y){
        return x + y;
    }

    static double addNumbers(double x, double y){
        return x + y;
    }

    static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end-1);
        }else{
            return 0;
        }
    }
    
    
    int x = 5;

    */
    
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args){
    
        /*
       
        //Using ternary operator as and if...else shorthand    
       
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        
        String javaResult = (isFishTasty) ? "Fish is tasty" : "Fish is not tasty";
        String fishResult = (isJavaFun) ? "Java is fun" : "Java is not fun";
        System.out.println(javaResult);
        System.out.println(fishResult);
        


        //Switch 
         
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                break;
        }
            

        //For-Each loop
         
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars){
            System.out.println(i);
        }
        

        //Continue and Break
         
        int i = 0;
        while (i < 10){
            if(i == 4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        
        
        //Array Loop
        
        String[] cars = {"Volvo", "BMW", "Benz"};
        for(int i=0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        

        //Looping through Arrays with for-each loop
         
        String[] cars = {"Volvo", "BMW", "Benz"};
        for(String i : cars){
            System.out.println(i);
        }
        

        
        //Method Overloading

        int myNum1 = addNumbers(4, 6);
        double myNum2 = addNumbers(4.2, 0.523);
        System.out.println("Integer: " + myNum1);
        System.out.println("Double: " + myNum2);
       
    

        //Recursion - Note, recursion is a very efficient and mathematically-elegant approach to programming
        int result = sum(5, 15);
        System.out.println(result);

   
        
        //Accepting User inputs
        Scanner ameyeDuwaa = new Scanner(System.in);
        System.out.println("Enter Username: ");

        String userName = ameyeDuwaa.nextLine();
        System.out.println("Username is: " + userName);

        


        //Object Oriented Programming
        Second secondObj = new Second();
        System.out.println(secondObj.name);

        */

        myStaticMethod();
        Main myObj = new Main();
        myObj.myPublicMethod();
    }


}


