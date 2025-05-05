import java.util.Scanner;

public class aatepate {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter First Number: ");
            int firstnum = input.nextInt();
            System.out.print("Enter Second Number : ");
            int Secondnum = input.nextInt();
            System.out.print("Enter Third Number : ");
            float thirdnum = input.nextFloat();
             int Sum = firstnum + Secondnum;
             float num = Sum + thirdnum;
             System.out.println("Sum of three Number is : " + num);
             float diff = Sum - thirdnum;
             System.out.println("Difference of the number is : " + diff);
             float mult = Sum * thirdnum;
             System.out.println("Multiply of the number is : " + mult);
             float div = Sum / thirdnum;
             System.out.println("Division of the number is : " + div); 
        }
    }
}
