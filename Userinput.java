import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        System.out.print("Please enter your name : ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + ",Please tell me your age :");
        int age = input.nextInt();
        System.out.println("Your age is : " + age);
        }
        
    }
}
