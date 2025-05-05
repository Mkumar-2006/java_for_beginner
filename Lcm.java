import java.util.Scanner;

 class Lcm {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM definer.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();
        int lcm = lcm( first, second);
        System.out.println("Your lcm is : " + lcm);
        input.close();
    }

    public static  int lcm(int first, int second){
        int i = 1;
        while(i <= second){
        int factor = first * i;
        if(factor % second== 0 ){
            return factor;
    }
    i++;
        }
        return 0;
    }
}
