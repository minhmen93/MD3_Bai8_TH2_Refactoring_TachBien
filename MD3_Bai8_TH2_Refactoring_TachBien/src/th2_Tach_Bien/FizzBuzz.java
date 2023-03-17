package th2_Tach_Bien;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean con1 = number % 3 == 0;
        boolean con2 = number % 5 == 0;
        if (con1 && con2)
           return "FizzBuzz";
       if (con1)
           return "Fizz";
        if (con2)
           return "Buzz";
       return number + "";
    }
}
