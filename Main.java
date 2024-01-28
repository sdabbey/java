public class Main{

    static void myMethod(String fname){
        System.out.println(fname + " Refsnes");
    }
    public static void main(String[] args){
     
        /*
        double myDouble = 9.782345456d;
        float myInt = (float) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   
        System.out.println(myInt);   
        */

        //Using ternary operator as and if...else shorthand    
        /* 
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        
        String javaResult = (isFishTasty) ? "Fish is tasty" : "Fish is not tasty";
        String fishResult = (isJavaFun) ? "Java is fun" : "Java is not fun";
        System.out.println(javaResult);
        System.out.println(fishResult);
        */


        //Switch 
        /* 
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
        */    

        //For-Each loop
        /* 
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars){
            System.out.println(i);
        }
        */

        //Continue and Break
        /* 
        int i = 0;
        while (i < 10){
            if(i == 4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        */
        
        //Array Loop
        /*
        String[] cars = {"Volvo", "BMW", "Benz"};
        for(int i=0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        */

        //Looping through Arrays with for-each loop
        /* 
        String[] cars = {"Volvo", "BMW", "Benz"};
        for(String i : cars){
            System.out.println(i);
        }
        */

        myMethod("Liam");
        myMethod("Jenny");
       

    }
}