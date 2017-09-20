import sun.invoke.empty.Empty;

import java.util.Scanner;


public class Exercise2
{
    public static void main(String args[])
    {

        String FirstName, LastName;
        float DistanceCycled, EmptyVar, Outcome;
        final float seven = 0.07f, ten = 0.10f;

        Scanner j = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        FirstName = j.nextLine();

        System.out.print("\nPlease enter you last name: ");
        LastName = j.nextLine();

        System.out.print("\nPlease enter the distance you cycled: ");
        DistanceCycled = j.nextFloat();
        EmptyVar =  DistanceCycled;
        if(DistanceCycled >= 0 && DistanceCycled <= 10)
        {
            System.out.println("\n\nYour name is: " + FirstName + ",\nYour last name is: " + LastName + ",\nThe distance you cycled: " + DistanceCycled +
                    ".\nThe amount you raised is: " + (DistanceCycled * seven));
        }
        else if(DistanceCycled >= 10.1f)
        {
            DistanceCycled = 10;
            Outcome =  (EmptyVar - DistanceCycled);
            System.out.println("\n\nYour name is: " + FirstName + ",\nYour last name is: " + LastName + ",\nThe distance you cycled: " + DistanceCycled +
                    ".\nThe amount you raised is: " + (DistanceCycled * seven  + Outcome * ten));
        }
    }
}
