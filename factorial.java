import java.util.Scanner;

 class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial Numbers..\n");
        System.out.print("Please,Enter your Number : ");
        int num = input.nextInt();
         long fact = factoril(num);
         System.out.print("Factorial is : " + fact);
         input.close();
    }

    public static long factoril(int num){
        if (num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
