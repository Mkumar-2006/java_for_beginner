import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println(" Finding the Perimeter of rectangle....... \n");
            System.out.print("Enter Side A : ");
            int A = input.nextInt();
            System.out.print("Enter Side B : ");
            int B = input.nextInt();
            System.out.print("Enter Side C : ");
            int C = input.nextInt();
            System.out.print("Enter Side D : ");
            int D = input.nextInt();
            int sum = A + B + C + D;
            System.out.print("Perimeter of rectangle : "  + sum + "cm");
        }
    }
}
