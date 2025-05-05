import java.util.Scanner;

public class GreatestIF {
    public static void main(String[] args) {
        System.out.print("Enter a Decimal Number : ");
        try(Scanner input = new Scanner(System.in)){
            float myNum = input.nextFloat();
            int gif = (int) Math.floor(myNum);
            System.out.print("The GIF of  "+ myNum + "  is : " + gif );
        }
    }
}