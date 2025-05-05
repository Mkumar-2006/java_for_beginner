import java.util.Scanner;

public class incdec {
    public static void main(String[] args) {
        System.out.println("Ye lo jeelo....\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = input.nextInt();
        System.out.print("Enter second number : ");
        int n2 = input.nextInt();
        String give = incredec(n1, n2);
        System.out.print(give);
        input.close();
    }

    public static String incredec(int n1, int n2){
        if(n1 > n2){
            System.out.println("App");
            for(int i=n1;i>=n2;i--){
                System.out.println(i);

            }
        }
        else if(n2 > n1){
            for(int j=n1;j<=n2;j++){
                System.out.println(j);
            }
        }
        else {
            System.out.println("Your condition cannot be approved");
        }
        
        return "Done & Dusted";

    }

}
