import java.util.Scanner;

public class Exercise3
{
    public static void main(String args[])
    {

        String name;
        float TaxableIncome;
        final float twenty = 0.20f, fourtyone = 0.41f;

        Scanner j = new Scanner(System.in);


        System.out.print("Please enter your name: ");
        name = j.nextLine();

        System.out.print("Please enter your taxable income: ");
        TaxableIncome = j.nextFloat();

        if(TaxableIncome >= 0 && TaxableIncome <= 20000.00f)
        {
            System.out.println("Your name is: " + name + ",\nYour taxable income is: " + TaxableIncome +
                    "\nYour tax rate is: 0%");
        }
        else if(TaxableIncome >= 20000.01f && TaxableIncome <= 36000.00f)
        {
            System.out.println("Your name is: " + name + ",\nYour taxable income is: " + (TaxableIncome * twenty) +
                    "\nYour tax rate is: 20%");
        }
        else if(TaxableIncome >= 36000.01f)
        {
            System.out.println("Your name is: " + name + ",\nYour taxable income is: " + (TaxableIncome * fourtyone) +
                    "\nYour tax rate is: 41%");
        }
    }
}
