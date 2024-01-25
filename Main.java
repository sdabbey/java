public class Main{
    public static void main(String[] args){
        //String firstName = "James", lastName = "Owusu",  fullName = firstName + " " + lastName;
        //float f1 = 35e3f;
        // double d1 = 12E4d;
        // System.out.println(d1);
        double myDouble = 9.782345456d;
        float myInt = (float) myDouble; // Manual casting: double to int

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        String javaResult = (isFishTasty) ? "Fish is tasty" : "Fish is not tasty";
        String fishResult = (isJavaFun) ? "Java is fun" : "Java is not fun";
        System.out.println(javaResult);
        System.out.println(fishResult);
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9


    }
}