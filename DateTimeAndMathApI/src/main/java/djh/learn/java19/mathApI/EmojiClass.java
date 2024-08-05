package djh.learn.java19.mathApI;

import java.util.Random;
import java.util.Scanner;

public class EmojiClass {
    public static void main(String[] args) {

        System.out.println("Guess the number from 1 to 10");
        int lives =3;
        System.out.println("You have only 3 lives    ❤️❤️❤️");
        Scanner sc  = new Scanner(System.in);
        int random = new Random().nextInt(10)+1;
        for (int i = 0; i <lives ; i++) {
            int guess = sc.nextInt();
            if(guess> random){
                System.out.println("Your guess is too high");
            } else if(guess< random){
                System.out.println("Your guess is too low");
            } else{
                System.out.println("Congrates your guess is correct!. You guessed : "+guess);
            }
        }

    }
}
