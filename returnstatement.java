import java.util.Scanner;

public class returnstatement {
    public static void main(String[] args) {
        greet();
        int first = inputnumber();
        int second = inputnumber();

        int sum = first + second;
        System.out.println("Sum is : " + sum);

    }

    public static int inputnumber(){
        try(Scanner input = new Scanner(System.in)){
        System.out.print("Please enter the  number : ");
        int number = input.nextInt();
        return number;
    }
        }

    public static void greet(){
        System.out.println("Good Morning,Alex\n");
        System.out.println("Welcome to return Statement\n");
    }
}

