import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter n1 : ");
            int a = input.nextInt();
            System.out.print("Enter n2 : ");
            int b = input.nextInt();
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }
    }
}
