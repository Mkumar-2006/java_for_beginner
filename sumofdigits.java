import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digits\n");
        System.out.print("Please Enter your number : ");
        int num = input.nextInt();
        int sum = sumofdigit(num);
        System.out.println("Sum is : " + sum);
        input.close();
    }


    public static int sumofdigit(int num){
        int sum = 0;
        while(num > 0){
            sum +=num % 10;
            num /= 10;
        } 
        return sum;
    }
}
