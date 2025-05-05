import java.util.Scanner;

public class Arraysearch {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Search...\n");
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.print("Enter the number you want to search : ");
        int num = input.nextInt();
        input.close();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("Your number was found in the array");
        }
        else{
            System.out.println("Your number was not found in the array");
        }
    
    }
        

    public static boolean isFound(int[] arr,int num){
        int i = 0;
        while(i<arr.length){
        if(arr[i] == num){
        return true;
    }
        i++;
}
        return false;

    }

}
// C:\Users\Dell Pc\Desktop\CODING\JAVA