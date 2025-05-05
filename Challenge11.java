import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        System.out.println("Checkin a number if its Positive,negative or zero\n\n");
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter any Number you think except 69 & infinity : ");
            int num = input.nextInt();

            if(num > 0){
                System.out.print("It's " + num + " and it's a Positive Number....");
            }
            else if(num < 0){
                System.out.print("It's " + num + " and it's a Negative Number....");
            }
            else {
                System.out.print("It is a zero number....");
            }
        }
    }
}
