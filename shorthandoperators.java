import java.util.Scanner;

public class shorthandoperators {
    public static void main(String[] args) {
        int a = 5;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Please,Enter a Number : ");
            int x1 = input.nextInt();
            a += x1;
            System.out.println(a);
            System.out.print("Please,Enter a Number : ");
            int x2 = input.nextInt();
            a += x2;
            System.out.print(a);
        }
    }
}
