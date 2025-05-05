import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Product of two floating Numbers : \n\n");
            System.out.print("Enter first number : ");
            float a = input.nextFloat();
            System.out.print("Enter Second Number : ");
            float b = input.nextFloat();
            float Product = a * b;
            System.out.println("Product of two number is : " + Product);
        }
    }
}
