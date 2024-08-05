package djh.learn.java19.mathApI;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());


        Random random1 = new Random();
        System.out.println(random1.nextInt(10));
        System.out.println(random1.nextInt(5,10));
        System.out.println(getRandomNumber_1(2,5));
    }
    static int getRandomNumber_1(int min, int max){
        Random random = new Random();
        int range = max - min;
        return random.nextInt(range) + min;
    }

    static int getRandomNumber_2(int min, int max){
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .orElse(0);
    }

    static int getRandomNumber_3(int min, int max){
        int range = max - min;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
    static int getRandomNumber_4(int min, int max){
        return   ThreadLocalRandom
                .current()
                .nextInt(min, max);
    }
}
