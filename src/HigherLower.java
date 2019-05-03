import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args ){
        int userGuess;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game\n");
        System.out.println("Pick a number between 1 and 10\n");
        System.out.println("Guess correctly win a prize\n");
        System.out.print("Pick a Number>>>>>");
        userGuess = input.nextInt();

        int random = (int) (Math.random() * 10 + 1);

        if(userGuess == random)
        {
            System.out.println("Guess correctly!!! Connor has your prize");

        }
        else if(userGuess > random)
        {
            System.out.println("Wrong number it was to high " + random);
        }

        else if(userGuess > random)
        {
            System.out.println("Wrong number it was to low");
        }

        else
        {
            System.out.println("That number was outside the range of 1-10");
        }


    }
}
