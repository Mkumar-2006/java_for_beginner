import java.util.Scanner;

public class Challenge1 {
        public static void main(String[] args)
        {
            System.out.print("Please enter your name : ");
            try(Scanner input = new Scanner(System.in)){
            String name = input.nextLine();
            System.out.println("Welcome " + name + " in Gurugram");
            }

        }    
}
