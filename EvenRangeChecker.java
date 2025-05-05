import java.util.Scanner;

public class EvenRangeChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to the Advanced loops\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Second number : ");
        int num2 = input.nextInt();

        while(num1 > num2){
            System.out.print("First number should be less than Second number, please try again :\n");
            System.out.print("first number : ");
            num1 = input.nextInt();
            System.out.print("Second number : ");
            num2 = input.nextInt();
        }

        if(num1 % 2 != 0){   
            int even1 = num1+1;
            System.out.println("Your number " + num1 + " was a odd number so we converted it to even number : " + even1);
            num1 += 1;
    }
    else{
        System.out.println("Your number is already an even number : " + num1);
    }
        if(num2 % 2 != 0){
        int even2 = num2+1;
        System.out.println("Your number " + num2 + " was a odd number so we converted it to even number : " + even2);
        num2 += 1;
    }
    else{
        System.out.println("Your number was already an even number : " + num2);
    }
        if(num2 == num1 + 2){
            System.out.print("There is no even number between" + num1 + "and" + num2);
        }

        for(int i=num1+2;i<num2;i+=2){
            System.out.print(i + " ");
        }
        input.close();
    }

}
