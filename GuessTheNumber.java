import java.util.Scanner ;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Random ra =new Random();
        int i ,attempt=1;

        int ranNum =ra.nextInt(100)+1;
        System.out.println("let's play GUESS THE NUMBERS game");
        System.out.println("only 5 attempt");


        for(i=1;i<=5;i++){
            System.out.println("enter your guess");
            int guessNum =s.nextInt();

            if(ranNum==guessNum){
                System.out.println("congrats...you win");
                break;
            } else if (ranNum<guessNum) {
                System.out.println("you select higher number");

            } else if (ranNum>guessNum) {
                System.out.println("you guess smaller number");

            }
            attempt++;
        }
        switch (attempt){
            case 1:
                System.out.println("you guess number in 1 attempt");
                System.out.println("you get 10 points");
                break;

            case 2:
                System.out.println("you guess number in 2 attempt");
                System.out.println("you get 8 points");
                break;

            case 3:
                System.out.println("you guess number in 3 attempt");
                System.out.println("you get 6 points");
                break;
            case 4:
                System.out.println("you guess number in 4 attempt");
                System.out.println("you get 4 points");
                break;
            case 5:
                System.out.println("you guess number in 5 attempt");
                System.out.println("you get 2 points");
                break;
            default:
                System.out.println("OUT !! ");
                System.out.println("5 attempt is over");
                System.out.println("computer number is : "+ranNum);
                break;

        }
    }
}
