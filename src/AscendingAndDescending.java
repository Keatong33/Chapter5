import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args){

        int userEntry1;
        int userEntry2;
        int userEntry3;
        String result = null;
        Scanner input = new Scanner(System.in);
        System.out.println("This is ascending and descending");
        System.out.println("Enter a number>>>>");
        userEntry1 = input.nextInt();
        System.out.println("Enter another number>>>");
        userEntry2 = input.nextInt();
        System.out.println("Enter another number>>>");
        userEntry3 = input.nextInt();

        if(userEntry1 > userEntry2)
        {
            if(userEntry2 > userEntry3)
            {
                result = userEntry1 + " " + userEntry2 + " " + userEntry3;
            }
            else
                result = userEntry1 + " " + userEntry3 + " " + userEntry2;
        }
        else if (userEntry2 > userEntry1 && userEntry2 > userEntry3)
        {
            if(userEntry1 > userEntry3){

            }
            else
                result = userEntry3 + " " + userEntry1 + " " + userEntry2;
        }


    }
}
