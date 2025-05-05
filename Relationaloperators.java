import java.util.Scanner;

public class Relationaloperators {
    public static void main(String[] args) {
        System.out.println("Welcome to the Liscense Portal.....\n");
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Please,Enter your Name : ");
            String name = input.nextLine();
            System.out.print("Also,Tell me your Age : ");
            int age = input.nextInt();
            
            if(age >= 18){
                System.out.println("You can drive a car  " + name);
            }
            else{
                System.out.println("You can drive a cycle  " + name);
            }
        }
    }
}
