import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Welcome to swapping Station...\n\n");
            System.out.print("Enter a Number A is : ");
            int a = input.nextInt();
            System.out.print("Enter a number B is : ");
            int b = input.nextInt();

            int c = a;
            a = b;
            b = c;

            System.out.println("Swapping Done......\n\n");
            System.out.println("Your Numbeer A is : " + a);
            System.out.println("Your Numbeer B is : " + b);
        }
    }
}
