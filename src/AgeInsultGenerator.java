import java.util.Scanner;

public class AgeInsultGenerator
{
    public static void main(String[] args)
    {

        int age;
        String result = null;
        String job;
        Scanner input = new Scanner(System.in);
        System.out.println("Wlewcome to my age inslut generator");
        System.out.println("Please enter your age>>>");
        age = input.nextInt();

        if (age <=12)
        {
            result = "You are not a teenager, and prabaly needs to learn how to use deodorant";
        }
        else if(age> 12 && age < 20)
        {
            result = "Your might be a teenager";
        }
        else if (age >=21 && age < 30)
        {
            result = "I hope you went to college and got a job!";
            System.out.println("Did you get a job>>>");
            job = input.next();
            if (job == "yes")
            {
                result ="Yes, I have a job";
            }
            else
                result = "No, I am a dead beat";
        }
        else if (age >=30 && age <40) {
            result = "You are a grown up";
        }
        else if (age >=40 && age <50)
        {
            result = "You are getting old";
        }
        else if (age>=50 && age < 60)
        {
            result = "I wonder if you have grandchildren";
        }


        displayMessage(result);
    }
    public static void displayMessage(String result)
    {
        System.out.println(result);
    }



}
