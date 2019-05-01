import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("What type of triangle are you solving for?");
        System.out.println("1. Right Triangle");
        System.out.println("2. Isoceles");
        System.out.println("3. Equalateral");

        choice = input.nextInt();

        if(choice == 1)
            rightTriangle();
        else if (choice == 2)
            isocelesTriangle();
        else if(choice == 3)
            equalateralTriangle();


        }
        public static void isocelesTriangle(){
            Scanner input = new Scanner(System.in);
            double sideA;
            double sideB;
            double sideC;
            String sideChoice;
            System.out.println("What side of the triangle are you trying to solve for? A, B , or C");
            sideChoice = input.next();
            if(sideChoice.equals("A")){

            }




        }
        public static void equalateralTriangle(){
            Scanner input = new Scanner(System.in);
            double sideA;
            double sideB;
            double sideC;
            String sideChoice;
            System.out.println("What side of the triangle are you trying to solve for? A, B , or C");
            sideChoice = input.next();
            if(sideChoice.equals("A")){
                


            }

        }
        public static void rightTriangle()
        {
            Scanner input = new Scanner(System.in);
            double sideA;
            double sideB;
            double sideC;
            String sideChoice;

            System.out.println("What side of the triangle are you trying to solve for? A, B , or C");
            sideChoice = input.next();
            if(sideChoice.equals("A")){
                System.out.println("What is side B?>>>");
                sideB = input.nextDouble();
                System.out.println("What is side C?>>>");
                sideC = input.nextDouble();
                calculateSideA(sideB, sideC, sideChoice);

            }
            else if (sideChoice.equals("B"))
            {
                System.out.println("What is side A?>>>");
                sideA = input.nextDouble();
                System.out.println("What is side C?>>>");
                sideC = input.nextDouble();
                calculateSideA(sideA, sideC, sideChoice);

            }
            else if (sideChoice.equals("C"))
            {
                System.out.println("What is side A?>>>");
                sideA = input.nextDouble();
                System.out.println("What is side B?>>>");
                sideB = input.nextDouble();
                calculateSideA(sideA, sideB, sideChoice);

        }
    }
    public static void calculateSideA(double b, double c, String choice){
        double a;
        a = Math.sqrt(c*c - b*b);
        System.out.println("The side" + choice + " = " + a);


    }

}
