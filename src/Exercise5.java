import java.util.Scanner;

public class Exercise5
{
    public static void main(String args[])
    {
        String Input;
        char Decision;

        Scanner j = new Scanner(System.in);

        System.out.print("Please enter the following options.\n'A' For Addition,\n'S' For Subtract,\n'M' For Multiplication,\n'D' For Division.");
        Input = j.nextLine();

        Input.toUpperCase();
        Decision = Input.charAt(0);

        switch(Decision)
        {
            case 'A':

                break;

            case 'S':

                break;

            case 'M':

                break;

            case 'D':

                break;

            default:
        }
    }
}
