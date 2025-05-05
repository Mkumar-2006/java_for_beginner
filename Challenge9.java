import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        System.out.println("Finding Compound Interest......\n\n ");
        try(Scanner input = new Scanner(System.in)){
        System.out.print("Enter Principal Value : ");
        int principal = input.nextInt();
        System.out.print("Enter the time taken in years : ");
        int time = input.nextInt();
        System.out.print("Enter Rate of Interst : ");
        double rate = input.nextDouble();
        double CI = principal*(1 + rate/100)*time;
        System.out.println("Compound Interest is : " + CI);
        }
    }
}
