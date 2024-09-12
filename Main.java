import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(100);
        int guess;
        System.out.println("Enter your first guess:");
        guess = scan.nextInt();
        int count=1;
        while(guess!= x){
            if (x < guess){
                System.out.println("It should be lower");
            }
            else if (x > guess){
                System.out.println("It should be higher");
            }
            System.out.println("Try again:");
            guess = scan.nextInt();
            count++;
            if (count>10){
                System.out.println("Try the divide and conquer strategy next time!");
                break;
            }
        }
        if (count<=7){
            System.out.println("You got an impossibly good score!");
        }
        else if (count>7 & count<=10){
            System.out.println("You did a good job!");
        }

    }
}