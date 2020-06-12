/*
Assignment 5
Bank of Gators: Simple ATM Interface
Millinh Apilado
920649519
CSC 210 - 03
Spring 2020
 */

import java.util.Scanner;

public class GatorATMIfElse{
    public static void main (String[] args){

        Scanner bank = new Scanner (System.in);

        //Declares and assigns variable acttype of datatype char to 'z'
        char acttype = 'z';

        //Declares and assigns variables flag, bal, and bal1 to 0, 500, and 1000 respectively
        int flag = 0, bal = 500, bal1 = 1000;

        //while false, it must get into the loop
        while(acttype != 'C' && acttype != 'S') {

            //User welcome prompt
            System.out.println("  ");
            System.out.println("Welcome to the Bank of Gators!");
            System.out.println("What would you like to do today?");
            System.out.println("Access your Savings (S) or Checking (C) account?: ");
            acttype = bank.next().charAt(0);

            //If acttype user input is 'C', then the function under gets executed
            if(acttype == 'C') {
                //reassigns flag to 1
                flag = 1;
                //Creates new variable transact of datatype char and assigns it to 'x'
                char transact = 'x';
                //While false, must enter the loop
                while(transact != 'w' && transact != 'd'&& transact != 'c'){
                    //Prompt to ask user how would they want to access their account
                    System.out.println("Do you want to Check Balance (c), Deposit (d), or Withdraw (w)?: ");
                    transact = bank.next().charAt(0);

                    //If user inputs 'c', then it displays the balance
                    if(transact == 'c'){
                        System.out.println("Your Balance is $" + bal + ".00");
                    }
                    //If user inputs 'd', then it asks user for deposit and adds it to the current balance
                    if(transact == 'd'){
                        int depo;
                        System.out.println("How much do you want to deposit?(i.e. 60): ");
                        depo = bank.nextInt();

                        bal = bal + depo;

                        System.out.println("Your current Balance is $" + bal + ".00");
                    }
                    //If user inputs 'w', then it asks for user amount for withdrawal and subtracts it from the current balance
                    if(transact == 'w'){
                        int withdraw;
                        System.out.println("How much would you want to withdraw? (i.e. 100): ");
                        withdraw = bank.nextInt();

                        bal = bal - withdraw;

                        if (bal < 10){
                            System.out.println("INVALID! Checking account must have remaining balance of $10.00");
                        }
                        else {
                            System.out.println("Your current balance is $" + bal + ".00");
                        }
                    }
                }
            }
            //Same as when user input is 'C'
            if(acttype == 'S') {
                flag = 1;
                char transact = 'x';
                while(transact != 'w' && transact != 'd' && transact != 'c'){
                    System.out.println("Do you want to Check Balance (c), Deposit (d), or Withdraw (w)?: ");
                    transact = bank.next().charAt(0);
                    if(transact == 'c'){
                        System.out.println("Your Balance is $" + bal1 + ".00");
                    }
                    if(transact == 'd'){
                        int depo;
                        System.out.println("How much do you want to deposit? (i.e. 10): ");
                        depo = bank.nextInt();

                        bal1 = bal1 + depo;

                        System.out.println("Your current Balance is $" + bal1 + ".00");
                    }
                    if(transact == 'w'){
                        int withdraw;
                        System.out.println("How much would you want to withdraw? (i.e. 30): ");
                        withdraw = bank.nextInt();

                        bal1 = bal1 - withdraw;

                        //bal1 remaining balance must not be less than 100 or else it would be invalid
                        if (bal1 < 100){
                            System.out.println("INVALID! Checking account must have remaining balance of $100.00");
                        }
                        else {
                            System.out.println("Your current balance is $" + bal1 + ".00");
                        }
                    }
                }
            }
            //If flag is 0, meaning the first input from user was already invalid, then it goes straight to this condition
            if (flag == 0) {
                System.out.println("  ");
                System.out.println("Input is invalid! Make sure it is (S) or (C)");
            }
            //If flag 1, then it goes to this condition and asks user if they want anymore transactions
            if (flag == 1){
                char ans;
                System.out.println("Thank you for using Bank of Gators ATM!");
                System.out.println("Would you like anymore transactions? (Y/N): ");
                ans = bank.next().charAt(0);

                if (ans == 'Y' || ans == 'y'){
                    acttype = ' ';
                }
                if (ans == 'N' || ans == 'n'){
                    System.out.println("Goodbye!");
                }
            }
        }
    }
}
