import java.util.Scanner;

public class Exercise1
{
    public static void main(String args[]) {
        String name, classNumber;
        int AmountOfSnacks;


        Scanner j = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = j.nextLine();

        System.out.print("\nPlease enter your class: ");
        classNumber = j.nextLine();

        System.out.print("\nPlease enter the amount of snacks you want: ");
        AmountOfSnacks = j.nextInt();

        System.out.println("\n\nYour name is: " + name + ",\nYour class is: " + classNumber + ",\nThe amount of snacks wanted: " + AmountOfSnacks + ".\n\nThe amount owed is: " + (AmountOfSnacks * 2) + "Euros.");
    }
}
