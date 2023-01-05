//number guessing

import java.util.*;
class guess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1 + (int)(100 * Math.random());   // generated numbers
        
        int K = 5;      //K trials

        int i,guess;

        System.out.println("Chosen a number between 1-100 , Guess it within 5 trials");

        for(i=0;i<K;i++){
            System.out.print("Guess the no. : ");
            guess = sc.nextInt();
            if(n==guess){
                System.out.println("Congrats ! You guessed the number.");
                break;
            }else if(n > guess && i != K-1) {
                System.out.println("The number is greater than " + guess);
            }else if(n < guess && i != K-1) {
                System.out.println("The number is less than " + guess);
            }
        }
        if(i==K) {
            System.out.println("You have exhausted K trials.");
            System.out.println("The number was " + n);
        }
    }
}

