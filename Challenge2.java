import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Welcome to our calculator");
            System.out.print("Please,Enter your first number : ");
            int firstnum = input.nextInt();
            System.out.print("Please,Enter your second number: ");
            int Secondnum = input.nextInt();
            int Sum = firstnum + Secondnum;
            System.out.println("Sum of two number is: " + Sum);
        }

    }
}
