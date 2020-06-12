/*
Assignment 5
Bank of Gators: Simple ATM Interface
Millinh Apilado
920649519
CSC 210 - 03
Spring 2020
 */

//Imports class Scanner
import java.util.Scanner;

public class GatorATMSwitch {
    public static void main (String[] args){

        //Instantiates new Scanner object named bank
        Scanner bank = new Scanner (System.in);

        //Declares and initializes datatype char variable acttype, assigned to 'x'
        char acttype = 'x';

        //Declares and initializes datatype int variable flag, bal, and bal1, assigned to values 0, 500, and 1000 respectively
        int flag = 0, bal = 500, bal1 = 1000;

        //Loop where acttype is true so it gets into the loop
        while(acttype == 'x'){

            //Welcome message
            System.out.println("  ");
            System.out.println("Welcome to the Bank of Gators!");
            System.out.println("What would you like to do today?");
            System.out.println("Access your Savings (S) or Checking (C) account?: ");

            //Reassigns acttype with user input
            acttype = bank.next().charAt(0);

            //Switch condition for flag
            switch(flag) {
                //case 0 of flag is when program actually executes
                case 0:
                    //Switch condition for acttype
                    switch (acttype) {
                        //case C to execute and allow user to access Checking account
                        case 'C':
                            //Declares and initializes datatype char variable transact and assigns it to 'x'
                            char transact = 'x';

                            //Shows the prompt to user of how they want to access their account
                            System.out.println("Do you want to Check Balance (c), Deposit (d), or Withdraw (w)?: ");

                            //Reassigns transact to user input
                            transact = bank.next().charAt(0);

                            //Switch condition for variable transact
                            switch (transact) {

                                //When user inputs c, it executes case 'c'
                                case 'c':

                                    //displays user balance that was initialized before the while loop at the top
                                    System.out.println("Your Balance is $" + bal + ".00");
                                //Break for the case to terminate after execution
                                break;

                                //When user inputs d, it executes case 'd'
                                case 'd':
                                    //declares variable depo for datatype int
                                    int depo;

                                    //Asks user how much they want to deposit
                                    System.out.println("How much do you want to deposit? (i.e. 200): ");
                                    //assigns variable depo to user input
                                    depo = bank.nextInt();

                                    //adds deposited amount to balance and reassigns the new balance to the sum
                                    bal = bal + depo;

                                    //Displays bal after summation
                                    System.out.println("Your current Balance is $" + bal + ".00");
                                //Breaks out of the case after execution
                                break;

                                //If user inputs 'w', then it goes to case 'w'
                                case 'w':

                                    //Declares variables withdraw and baltest as datatype int
                                    int withdraw, baltest;

                                    //asks use how much would they want to withdraw from their account
                                    System.out.println("How much would you want to withdraw? (i.e. 50): ");
                                    //Assigns variable withdraw to user input
                                    withdraw = bank.nextInt();

                                    //Formula that deducts user input from the original balance
                                    bal = bal - withdraw;

                                    //If the difference is less than 10, then withdrawal couldn't proceed as there must
                                    //be a remaining balance of at least $10.00
                                    if (bal < 10) {
                                        System.out.println("INVALID! Checking account must have remaining balance of $10.00");
                                    }
                                    //else it displays the now new balance
                                    else {
                                        System.out.println("Your current balance is $" + bal + ".00");
                                    }
                                break;
                        }
                        //breaks out of the case 'C'
                        break;
                        //Enters case 'S' if user wants to access Savings account
                        case 'S':
                            //All same conditions for case 'C'
                            char transact1 = 'x';
                            System.out.println("Do you want to Check Balance (c), Deposit (d), or Withdraw (w)?: ");
                            transact1 = bank.next().charAt(0);
                            switch (transact1) {
                                case 'c':
                                    System.out.println("Your Balance is $" + bal1 + ".00");
                                break;
                                case 'd':
                                    int depo;
                                    System.out.println("How much do you want to deposit? (i.e. 200): ");
                                    depo = bank.nextInt();

                                    bal1 = bal1 + depo;

                                    System.out.println("Your current Balance is $" + bal1 + ".00");
                                break;
                                case 'w':
                                    int withdraw, baltest1;
                                    System.out.println("How much would you want to withdraw? (i.e. 50): ");
                                    withdraw = bank.nextInt();

                                    bal1 = bal1 - withdraw;

                                    //Cannot withdraw if remaining balance is less than $100.00
                                    if (bal1 < 100) {
                                        System.out.println("INVALID! Checking account must have remaining balance of $100.00");
                                    } else {
                                        System.out.println("Your current balance is $" + bal1 + ".00");
                                    }
                                break;
                        }
                        break;
                        //default executes if none of the cases are met, basically if input by user was invalid in the first place
                        default:
                            System.out.println("Invalid input! Try again.");
                            //reassigns acttype to 'x' to restart the loop
                            acttype ='x';
                    }
                //After accessing case 0 for flag, case 1 appears since there is no break; after case 0
                case 1:
                    //Thanks the customer for using BoG and asks if they want to access the ATM once again
                    char ans;
                    System.out.println("Thank you for using Bank of Gators ATM!");
                    System.out.println("Would you like anymore transactions? (Y/N): ");
                    ans = bank.next().charAt(0);

                    //if Y, then it assigns acttype back to 'x' and goes back to the beginning of the loop
                    if (ans == 'Y' || ans == 'y') {
                        acttype = 'x';
                    }
                    //If N, then it assigns acttype to 'z' for the loop to not push through
                    if (ans == 'N' || ans == 'n') {
                        acttype = 'z';
                        System.out.println("Goodbye!");
                    }
                break;
            }
        }
    }
}

