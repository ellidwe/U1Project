//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("How much is the bill? (Don't enter symbols) ");
        String billBeforeTip = s.nextLine();
        double billBeforeTipDouble = Double.parseDouble(billBeforeTip); //Assigns entered value to a double for future use

        System.out.print("How many people are in your party? ");
        String partySize = s.nextLine();
        int partySizeInt = Integer.parseInt(partySize); //Assigns entered value to an int for future use

        System.out.print("What percent of the bill would you like to tip? (Don't enter symbols) ");
        String tipPercent = s.nextLine();
        int tipPercentInt = Integer.parseInt(tipPercent);
        double tipPercentDecimal = tipPercentInt * 0.01; //Converts entered value into a decimal for future use

        double tipAmount = tipPercentDecimal * billBeforeTipDouble; //Multiplies the tip percent and the bill before the tip to find the tip amount
        double totalWithTip = tipAmount + billBeforeTipDouble; //Adds the tip amount and the bill before the tip to find the total bill with the tip
        double tipPerPerson = tipAmount / partySizeInt; //Divides the tip by the party size to find the tip per person
        double totalPerPerson = totalWithTip / partySizeInt; //Divides the total with the tip by the party size to find the total per person

        System.out.println();
        System.out.printf("The total tip is $" + "%.2f",tipAmount); //Formats tip amount to have 2 decimal places
        System.out.println();
        System.out.printf("The total price with the tip is $" + "%.2f",totalWithTip); //Formats tip amount to have 2 decimal places
        System.out.println();
        System.out.printf("The total tip per person is $" + "%.2f",tipPerPerson); //Formats tip amount to have 2 decimal places
        System.out.println();
        System.out.printf("The total with the tip per person is $" + "%.2f",totalPerPerson); //Formats tip amount to have 2 decimal places

    }
}