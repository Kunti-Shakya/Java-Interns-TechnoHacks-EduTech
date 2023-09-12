import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double num1 ,num2;
        boolean exit =false;

        while(!exit) {
            System.out.println("1 : for addition");
            System.out.println("2 : for subtraction");
            System.out.println("3 : for multiplication");
            System.out.println("4 : for division");
            System.out.println("5 : exit (if you want to exit calculator)");
            System.out.println("Select operations");

            int choice = s.nextInt();
            switch(choice){
                case 1:
                    System.out.print("enter first number:");
                    num1 =s.nextDouble();
                    System.out.print("enter second number");
                    num2 =s.nextDouble();
                    System.out.println("Result :"+(num1+num2));
                    break;
                case 2:
                    System.out.print("enter first number:");
                    num1 =s.nextDouble();
                    System.out.print("enter second number");
                    num2 =s.nextDouble();
                    System.out.println("Result :"+(num1-num2));
                    break;
                case 3:
                    System.out.print("enter first number:");
                    num1 =s.nextDouble();
                    System.out.print("enter second number");
                    num2 =s.nextDouble();
                    System.out.println("Result :"+(num1*num2));
                    break;
                case 4:
                    System.out.print("enter first number:");
                    num1 =s.nextDouble();
                    System.out.print("enter second number");
                    num2 =s.nextDouble();
                    System.out.println("Result :"+(num1/num2));
                    break;
                case 5:
                    exit =true;
                    System.out.println("exiting calculator");
                    break;
                default:
                    System.out.println("Sorry... your selected operation is not in the list");
                    break;
            }
        }
    }
}
