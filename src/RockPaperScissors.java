import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose 1 for rock, 2 for paper, or 3 for scissors");
        result = input.nextInt();
        int random = (int) (Math.random() * 3 + 1);

        if (result == 1) {
            if (random == 1) {
                System.out.println("You tie");
            } else if (random == 2) {
                System.out.println("You lose");
            } else if (random == 3) {
                System.out.println("You Win!!!!!!!!!!!!!!!!!!!");
            }
        }
        if (result == 2)
        {
            if (random == 2) {
                System.out.println("You tie");
            } else if (random == 3) {
                System.out.println("You lose");
            } else if (random == 1) {
                System.out.println("You Win!!!!!!!!!!!!!!!!!!!");

            }
        }
            if (result == 3)
            {
                if (random == 3)
                {
                    System.out.println("You tie");
                } else if (random == 1)
                {
                    System.out.println("You lose");
                } else if (random == 2)
                {
                    System.out.println("You Win!!!!!!!!!!!!!!!!!!!");


                }
            }
        }
    }