
public class whileLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to While Loops\n\n");
        System.out.println("This is a Right half pyramid pattern\n");
        printpattern();        
        }
        public static void printpattern(){
            int i = 0;
            while(i < 5){
                System.out.print("*");
                int j = 0;
                while(j < i){
                System.out.print(" *");
                j++;
                }
                System.out.println();
                i++;
            }
        }
    }

