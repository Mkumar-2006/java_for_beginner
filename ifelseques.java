import java.util.Scanner;

public class ifelseques {
    public static void main(String[] args) {
        System.out.println("We are finding your percentage...\n");
        try(Scanner input = new Scanner(System.in)){
            System.out.print("please tell me your name : ");
            String name = input.nextLine();
            System.out.println("Enter marks of the subjects given below......");
            System.out.print("ENGLISH : ");
            int eng = input.nextInt();
            if(eng > 100 ){
                System.out.print("Value must be or less than 100.Try again : ");
                eng = input.nextInt();
            }
            System.out.print("MATHEMATICS : ");
            int math = input.nextInt();
            if(math > 100){
                System.out.print("Value must be or less than 100.Try again : ");
                math = input.nextInt();
            }
            System.out.print("SCIENCE : ");
            int sci = input.nextInt();
            if(sci > 100){
                System.out.print("Value must be or less than 100.Try again : ");
                sci = input.nextInt();
            }
            double percentage = (eng + math + sci)/3.0;
            System.out.println("Yor percentage is : " + percentage);

            if(percentage > 90){
                System.out.println(name + " Your grade is : A+");
            }
            else if(percentage > 80 && percentage < 90){
                System.out.println( name + " Your grade is : A");
            }
            else{
                System.out.println(name + " Your grade is : B");
            }
            if(eng <= math && eng <= sci){
                System.out.println(name + " You have to work on English..." );
            }
            else if(math <= eng && math <= sci){
                System.out.println(name + " You have to work on Mathematics...");
            }
            else{
                System.out.println(name + " You have to work on Science.....");
            }
            System.out.println(name + " A SINGLE SHEET OF PAPER CANNOT DECIDE YOUR FUTURE");
        }
    }
}
