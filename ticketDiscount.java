import java.util.Scanner;

public class ticketDiscount {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Welcome to  Ticket Discount Calculator....\n");
            System.out.print("Please,Enter your name : ");
            String name = input.nextLine();
            System.out.print("Please,Tell me your age : ");
            int age = input.nextInt();
            System.out.print("Are you female(True/False) : "  );
            boolean isFemale = input.nextBoolean();

            if(age < 5){
                System.out.print("You got a 25% discount " + name);
            }
            else if (isFemale){
                System.out.print("You got a 75% discount " + name);
            }
            else if(age > 60 && !isFemale){
                System.out.print("You got a 50% discount " + name);
            }
            else {
                System.out.print("You got no discount " + name);
            }
        }
    }
}
