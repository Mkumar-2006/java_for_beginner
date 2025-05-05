 import java.util.Scanner;
    public class whileques {

    public static void main(String[] args) {
        System.out.println("We are finding your percentage...\n");
        Scanner input = new Scanner(System.in);
            System.out.print("please tell me your name : ");
            String name = input.nextLine();
            System.out.println("Enter marks of the subjects given below......");
            System.out.print("ENGLISH : ");
            int eng = input.nextInt();
            input.close();

                while(eng > 100 ){
                System.out.print("Value must be or less than 100 \n");
                System.out.println("Tere bas ki to 100 lana bhi nhi h isse jyada kyu dal rha h dalle....");
                System.out.print("Dubara dal : ");
                eng = input.nextInt();
               }
        System.out.print("MATHEMATICS : ");
        int math = input.nextInt();

            while(math > 100){
                System.out.print("Value must be or less than 100.\n ");
                System.out.print("Tere bas ki to 100 lana bhi nhi h isse jyada kyu dal rha h dalle...... ");
                System.out.print("Dubara dal : ");
                math = input.nextInt();
                }
            System.out.print("SCIENCE : ");
            int sci = input.nextInt();
            while(sci > 100){
                System.out.print("Value must be or less than 100.\n");
                System.out.println("Tere bas ki to 100 lana bhi nhi h isse jyada kyu dal rha h dalle : ");
                System.out.print("Dubara dal : ");
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
            System.out.println(name + "bhadwe itne number bhi aa gye bahot h ummed nhi thi waise bhii...");
        }
    }


