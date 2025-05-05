import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        System.out.println("Welcome to Greatest Common Divisor");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter First number : ");
        int First = input.nextInt();
        System.out.print("Please enter Second number : ");
        int Second = input.nextInt();
        int Gcd = Gcd(First, Second);
        System.out.print("Your Greatest common divisor of the number is : " + Gcd);
        input.close();
    }

    public static int Gcd(int First,int Second){
        int Gcd = 1;
        int i = 2;
        int least = least(First, Second);
        while(i <= least){ 
            if(First % i == 0 && Second % i == 0){
                Gcd = i;
            }
            i++;
        }
       
        return Gcd;
    }

    public static int least(int First,int Second){
        if(First < Second){
            return First;
        }
        else{
            return Second;
        }
    }
}
