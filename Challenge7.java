import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        System.out.println("Calculating the Area of triangle...... \n\n");
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the breadth of triangle : ");
            double breadth = input.nextDouble();
            System.out.print("Enter the height of triangle : ");
            double height = input.nextDouble();
            double Area = 0.5 * breadth * height;
            System.out.println("Area of Triangle is :  " + Area + "  sq.mtr");
        }
    }
}
