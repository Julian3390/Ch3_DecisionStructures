package com.company;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {

        /**
         * -----------------
         * The If-Statement
         * -----------------
         * syntax1:
         * if (BoleanEcpression)
         *      statement; // NOTICE!: Semi-cplon Placement &
         *  ^ tab space below if
         *  // used for single commands
         *
         *  syntax2:
         *  if (BooleanExpression)
         *      {
         *      condition1;
         *      condition2;
         *      condition3...;
         *      }
         *  // Must use curly brackets to execute every condition in if statement or program
         *     will only execute the first line under if statement
         *  // Used to execute multiple condition statements
         *
         *
         * -----------------------------------
         * Relational Operators for Conditions
         * -----------------------------------
         *  > | Greater Than
         *  < | Less Than
         *  >=| Greater Than or Equal to
         *  <=| Less Than or Equal to
         *  ==| Equal to
         *  !=| Not Equal to
         *
         */


        /**
        // Code that asks user to enter 3 tests scores and calculates the avg.
        // If avg. is >= 95, let them know it is a grate score
        double score1, score2, score3, avg;
        String input;

        input = JOptionPane.showInputDialog(null, "Enter Score 1");
        score1 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Enter Score 2");
        score2 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Enter Score 3");
        score3 = Double.parseDouble(input);

        avg = (score1 + score2 + score3) / 3;

        if (avg > 95)
            JOptionPane.showMessageDialog(null, "AVG.: "+ avg + "\nGreat Job!");
            else
                JOptionPane.showMessageDialog(null,  "AVG.: " + avg + "\nStudy Harder.");
        */

        /**
         * ------------
         * Boolean
         * ------------
         * Boolean variables can only be true or false
         *
         * ex.
         * boolean goodJob;
         * if (score => 90)
         *      goodJob = True
         *
         *
         * ----------------
         * Comparing Char.s
         * ----------------
         * You can compare char.s using (==) or (!=)
         * ex.
         * if (firstInitial == "J")
         *      name = "Julian";
         * ex2.
         * if (firstInitial != "J")
         *      name != "Julian"
         *
         *  Unicode: Set of #s representing all letters, numbers, special char.s
         *
         *
         *
         *
         * ---------------------
         * If-else statement
         * ---------------------
         * Executes block statement if true, or jumps to else statement
         *
         * syntax:
         * if (booleanExpression)
         *      {
         *      expression1;
         *      expression2;
         *      }
         * else
         *      {
         *      statement1;
         *      statement2;
         *      }
         *
         *
         * -------------------
         * Nested if-statement
         * -------------------
         * // If statement w/in another if statement
         *
         * syntax:
         * if (booleanExpression)
         *       {
         *          if (booleanExpression)
         *              {
         *              expression;
         *              }
         *        }
         *
         * ------------------------
         * The if-else-if statement
         * ------------------------
         * // simpler way of decision making compared to nested if statement
         * // similar to nested if statement
         *
         * syntax:
         * if (expression1)
         *  {
         *      statement;
         *      statement;
         *  }
         * else if (expression2)
         *  {
         *      statement;
         *      statement;
         *  }
         * else (expression3)
         *  {
         *      statement;
         *      statement;
         *  }
         *
         *
         * // If expression1 is TRUE, then it will execute statements in expression1 and ignore rest
         * // If expression1 is FALSE, then it will test expression2 and if not TRUE, then exp.3
         *
         */

        /**
        // Prog. that asks user to enter their percentage grade and returns their letter grade
        String gradeInp, lettergrade;
        double percent;

        gradeInp = JOptionPane.showInputDialog(null, "Enter percent");
        percent = Double.parseDouble(gradeInp);

        if (percent >= 90)
            JOptionPane.showMessageDialog(null, "Your grade is an A.");
        else if (percent >= 80)
            JOptionPane.showMessageDialog(null, "Your grade is a B.");
        else if (percent >= 70)
            JOptionPane.showMessageDialog(null, "Your grade is a C.");
        else
            JOptionPane.showMessageDialog(null, "You are failing.");
        */


        /**
         * -----------------
         * Logical Operators
         * -----------------
         *
         *
         * Op. | Meaning | Syntax
         * ----|---------|--------
         * &&  |   AND   | x > y && y > z
         * // expA and expB must be TRUE
         *     |         |
         * ||  |   OR    | x > y || y > z
         * // expA or expB must be TRUE
         *     |         |
         * !   |   NOT   | !(x > y)
         * // expA must NOT be true
         */


        /**
         * ------------------------
         * Comparing String Objects
         * ------------------------
         * // Cannot compare string objects using relational operators
         * // Compare using equals, compareTo, compareToIgnoreCase, equalsIgnoreCase
         *
         * equals method
         * // case sensitive
         * //syntax:
         * StringReference1.equals(StringReference2)
         * // ex.
         * name1.equals(name2);
         *
         *
         * compareTo method
         * // case sensitive
         * // "a" and "A" contain different val.s
         * // Determines if one string is GT, EQ, or LT another string
         *
         * //syntax:
         * StringReference1.compareTo(StringReference2)
         *
         *
         * CompareToIgnoreCase / EqualsIgnoreCase method
         * // not case sensitive and ignores case in string comparisons
         * // "A" == "a"
         * // works like equals and compareTo methods
         * // syntax1:
         * stringReference1.equalsIgnoreCase(stringReference2)
         *
         * // syntax2:
         * stringReference1.compareToIgnoreCase(stringReference2)
         *
         */

        /**
        // Compare names Mark, Mark, and Mary using .equals
        String name1, name2, name3;
        name1 = "Mark";
        name2 = "Mark";
        name3 = "Mary";
        boolean same;


        // Compare Mark and Mark
        if (name1.equals(name2))
        {
            same = true;
            System.out.println(same + ", both names are the same.");
        }

        else
        {
            same = false;
            System.out.println(same + ", both names are not the same.");
        }
        */






        /**
         * ----------------------------------
         * Variable Declaration and Scope
         * ----------------------------------
         * Scope: limited to block which it is declared in
         * local variable: variable inside of a method
         */


        /**
         * ---------------------------
         * Conditional Operator (?)(:)
         * ---------------------------
         * // The simple if-else statement
         * // syntax:
         * BoolExp ? val1 : val2;
         *
         * // if boolExp == TRUE, val of conditional expression = val1
         * // if boolExp2 == FALSE, val of conditional expression = val2
         * ex.
         * y = (x < 0) ? 10 : 20 // y = 10 if x < 0, 20 if !( x < 0)
         */


        /**
         * --------------------
         * The Switch Statement
         * --------------------
         * // Lets value of var./expr. determine where to branch to
         * // similar to if-else-if statement
         * // syntax:
         * switch (switchExpr)
         * {
         *      case expression1: // NOTICE: Colon after expression
         *      {
         *          statement1;   // NOTICE: Semicolon for statements inside of expression
         *          statement2;
         *          break;        // NOTICE: Break statement to break out of switch statement
         *      }
         *      case expression2:
         *      {
         *          statement1;
         *          statement2;
         *          break;
         *      }
         *      case expression3:
         *      {
         *          statement1;
         *          statement2;
         *          break;
         *      }
         *      default:
         *      {
         *          statement1;
         *          statement2;
         *      }
         * }
         *
         * // can use as many case expr. as you need
         * // caseExpr. must be in form of char, byte, int, short
         * // if not in any of those forms, you may cast the val.s into the required form
         *
         */

        /**
        // Problem that asks user to enter value 1, 2, or 3 & prints out that value using switch statement
        int num;
        String input;

        input = JOptionPane.showInputDialog(null, "Enter 1, 2, or 3.");
        num = Integer.parseInt(input);

        switch (num)
        {
            case 1:
            {
                System.out.println("you entered 1");
                break;
            }
            case 2:
            {
                System.out.println("you entered 2");
                break;
            }
            case 3:
            {
                System.out.println("you entered 3");
                break;
            }
            default:
            {
                System.out.println("You did not enter 1, 2, or 3.");
            }
        }
        */

        /**
        // Program that asks user to enter the a or b.
        String letter;
        letter = JOptionPane.showInputDialog(null, "Enter a or b." +
                " Case does not matter");
        switch (letter)
        {
            case "a":
            case "A":
            {
                System.out.println("You entered a.");
                break;
            }
            case "b":
            case "B":
            {
                System.out.println("You entered B.");
                break;
            }
            default:
            {
                System.out.println("You did not enter a or b.");
            }
        }
         */


        /**
         * -------------------
         * The Formatter Class
         * -------------------
         * // Used to round floating point #s
         * // MUST import java.text.DecimalFormat;
         * // You may create an object/instance of the class
         * // Syntax:
         * import java.text.DecimalFormat;
         *
         * DecimalFormat formatter = new DecimalFormat("#0.00");
         * // "new" used to create new object in memory
         * // var. named formatter declared
         * // var. datatype is
         *
         *
         *
         * ------------------------------------
         * Inserting commas using DecimalFormat
         * ------------------------------------
         * // used for large numbers (thousands, millions)
         * // syntax:
         * DecimalFormat formatter = new DecimalFormat(#,##0.00)
         *
         * OUTPUT: 1,434.00 OR 1,434,789.98
         *
         *
         * -----------------------------
         * Percentages for DecimalFormat
         * -----------------------------
         * // syntax:
         * DecimalFormat percentages = new DecimalFormat("#0%)
         *
         * OUTPUT: 3% or 32%
         */

        /**
        // Program that rounds 3.147 to 2 decimal places
        double round = 3.147;

        DecimalFormat hundreds = new DecimalFormat("#0.00");
        System.out.println(hundreds.format(round));
        */

        /**
        // 3.31 Assume a double holds the value 456.6329. How can you display this as 00459.633?
        double value = 456.6329;
        DecimalFormat ex331 = new DecimalFormat("##0.0000");

        System.out.println(ex331.format(value));
        */

        /**
        // Assume a double holds a value3,235,771.1 now display outp. as 3,235,771.10
        double ex333 = 3_235_771.1;

        DecimalFormat ex3dot33 = new DecimalFormat("#,##0.00");
        System.out.println(ex3dot33.format(ex333));
        */


        /**
         * -----------------
         * The printf method
         * -----------------
         * // method allows to print output in many different ways
         * // %d prints integer (int)
         * // %f prints floating point/ double
         * // syntax:
         * system.out.printf("Sentence here, %d <- integer variable there")
         * system.out.printf("Sentence here, %f <- double / float variable there")
         *
         * // ex using %d.
         * int dogs = 2, cats = 1
         * system.out.printf("I have %d dogs and %d cats.", dogs, cats)
         *
         * OUTPUT: I have 2 dogs and 1 cats.
         *
         *
         * // ex.
         * double bankAcc = 227.83
         * system.out.printf("I have %f in my bank account.")
         *
         * OUTPUT:
         * I have 227.83 in my bank account.
         *
         *
         *
         * -------------------
         * Applying formatting
         * -------------------
         * // Format specifier includes the field width
         * // text fills from right to left.
         * // ex. %6d implies field width of 6. ______
         *
         *
         *
         * ------------------------------------------
         * Using field spaces w/ floating point val.s
         * ------------------------------------------
         * // Specify #s after decimal to output using %#.f
         *      Replace # with number you want to round to
         *      // ex. #2.f rounds to decimal to 2 places
         *
         * // Syntax: %#.f
         *
         * // ex. Round pi to 2 decimal places and output a sentence using %2.f
         * double pi = 3.14159;
         *
         * system.out.printf("Pi rounded to 2 decimal places is %2.f", pi)
         *
         * OUTPUT: Pi rounded to 2 decimal places is 3.14
         *
         *
         *
         * --------------------------
         * Sorting large #s w/ commas
         * --------------------------
         * // Place comma(,) after the (%)mod
         * // Syntax:
         * %,.#f // Replace # w/ rounding position
         *
         * // ex.
         * double pay = 1_364_279.2648;
         * system.out.printf("My pay is %,.2f") // Places commas and rounds to 2 decimal points
         *
         *
         */

        /**
        int num1 = 32346, num2 = 42, num3 = 4563, num4 = 2435;
        System.out.printf("%5d, %5d\n", num1, num2);
        System.out.printf("%5d, %5d", num3, num4);

        // OUTPUT:
        // 32346,____42
        // _4563,__2435
         */


        /**
         * -------------
         * the %s method
         * -------------
         * // %s method is used to print strings
         * // ex.
         * String name = "Julian";
         * system.out.printf("My name is %s", name);
         *
         * OUTPUT:
         * My name is Julian
         *
         * // Use the %s method to sort 2 names under eachother with a field space of 7.
         *
         * String name1 = "Julian", name2 = "Bryan";
         * System.out.printf("%7s \n%7s", name1, name2);
         *
         * OUTPUT:
         * Julian
         *  Bryan // notice _Bryan in field space
         *
         */



        /**
         13. Internet Service Provider (Pt. 1)
         An internet service provider has three different subscription packages for its customers:
         Package A:     For $9.95 / month, 10 hours of access are provided. Additional hours
                        are $2 / hour
         Package B:     For $13.95 / month, 20 hours of access are provided. Additional hours
                        are $1 / hour
         Package C:     For $19.95 / month unlimited access is provided

         Write a program that calculates a Customer's monthly bill. It should ask the user to enter
         the letter package the customer has purchased (A, B, or C) and the # of hours
         that were used. It should then display the total charges
        */
        /**
        double packA = 9.95, packB = 13.95, packC = 19.95, userHours, bill;
        String userPack, userHourString, billMessage;

        // 1. User enters package
        userPack = JOptionPane.showInputDialog(null, "Which package?");
        userHourString = JOptionPane.showInputDialog(null, "Hours used.");
        userHours = Double.parseDouble(userHourString);

        switch (userPack)
        {
            case "a":
            case "A":
                { // Package A: For $9.95 / month, 10 hours of access are provided. Additional hours
                  // are $2 / hour
                if (userHours > 10)
                    {
                    bill = packA + ((userHours - 10.00)  * 2.00);
                    JOptionPane.showMessageDialog(null, "TOTAL: $ " +
                            bill);
                    }
                else
                    {
                    bill = packA;
                    System.out.println("TOTAL: $" + bill);
                    }
                break;
                }
            case "B":
            case "b":
                // Package B: For $13.95 / month, 20 hours of access are provided. Additional hours
                //            are $1 / hour

                {
                    if (userHours > 20)
                    {
                        bill = packB + ((userHours - 20) * 1);
                        JOptionPane.showMessageDialog(null, "TOTAL: $" + bill);
                    }
                    else
                    {
                        bill = packB;
                        JOptionPane.showMessageDialog(null, "TOTAL: $" + bill);
                    }
                break;
                }

            case "C":
            case "c":
            { // Package C: For $19.95 / month unlimited access is provided
                bill = packC;
                JOptionPane.showMessageDialog(null, "TOTAL = $" + bill);
                break;
            }
            default:
                System.out.println("Incorrect");
        }
        */

    }
}
