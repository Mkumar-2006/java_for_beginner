import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Welcome to the Multiplication of table \n");
            System.out.print("Enter the number you want to be multiple : ");
            int num = input.nextInt();
            Multipleoftable(num);
  }
        
        }

        public static void Multipleoftable(int num){
            int i = 1;
            while(i <= 10){
                System.out.println(num + " X " + i + " = " + (num * i));
                i++;
            }
        }
    }






