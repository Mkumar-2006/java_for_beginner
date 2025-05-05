import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        System.out.println("Find Simple Interest....\n");
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter Principal Value : ");
            int principal = input.nextInt();
            System.out.print("Enter the time taken in years : ");
            int time = input.nextInt();
            System.out.print("Enter Rate of Interst : ");
            double Rate = input.nextDouble();
            double SI = (principal * time * Rate)/100;
            System.out.print("Simple Interest is : " + SI); 
        }
    }
}
