import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        System.out.println("Covert Fahrenheit into Celsius :\n\n ");
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Your fahreneit is : ");
            int fahreneit = input.nextInt();
            double Celsius = (fahreneit - 32) * 5/9;
            System.out.print("Degree in celsius is : " + Celsius);  
        }
    }
}
