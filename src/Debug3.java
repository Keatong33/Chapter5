
import java.util.Scanner;

public class Debug3 {
    public static void main (String args[])
    {
        int item;
        String output;
        final int LOW = 111;
        final int HIGH = 9;
        final int CUTOFF = 500;
        calculateOutPut(item,output,LOW,HIGH,CUTOFF);

    }
    public static void calculateOutPut(int item,String output,int LOW, int HIGH,int CUTOFF)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter item number");
        item = input.nextInt();
        if(item < LOW) output = "Item number too low";
        else
        if(item > HIGH)
            output = "Item number too high";
        else
        if(item > CUTOFF)
            output = "Valid - in Automotive Department";
        else
            output = "Valid - Item in Housewares Department"
        System.out.println(output);
    }
}