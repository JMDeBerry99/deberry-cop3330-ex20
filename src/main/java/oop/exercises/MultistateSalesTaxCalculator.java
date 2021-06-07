/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class MultistateSalesTaxCalculator
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String input = in.nextLine();
        int amount = Integer.parseInt(input);
        System.out.print("What state do you live in? ");
        String state = in.nextLine();
        String taxStatement = "";
        double tax;
        double total = amount;

        if(state.equalsIgnoreCase("Wisconsin"))
        {
            tax = total * 0.05;
            System.out.print("What county do you live in? ");
            String county = in.nextLine();

            if(county.equalsIgnoreCase("Eau Claire"))
            {
                tax = tax + total * 0.005;
            }
            if(county.equalsIgnoreCase("Dunn"))
            {
                tax = tax + total * 0.004;
            }

            taxStatement = "The tax is $" + tax + ".\n";
            total += tax;
        }

        if(state.equalsIgnoreCase("Illinois"))
        {
            tax = total * 0.08;
            taxStatement = "The tax is $" + tax + ".\n";
            total += tax;
        }

        System.out.printf(taxStatement + "The total is $%.2f.", total);

    }
}
