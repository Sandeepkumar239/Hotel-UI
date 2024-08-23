package com.ui.services;
import com.ui.interfaces.UserInputHandler;
import helper.MessageDisplay;

import java.util.Scanner;
public class CheckoutPageUI implements UserInputHandler {
    public String contact;
    private int pendingExpenseStatus=0;
    @Override
    public void collectInput(Scanner scanner){
        System.out.println("================================================");
        System.out.println("         Checkout - Fill required details");
        System.out.println("================================================");
        System.out.println("Enter Contact : ");

        contact = scanner.nextLine();

        // Do checkout
        //1 or 0
        //if checkedout show message
        //Get list of expenses by himansu's code
        //else go to admin menu page



        if(pendingExpenseStatus==0){
            //Print each room no with their expense
            MessageDisplay.showMessage("Want to clear expense?\n1 .Yes    2 .No\nEnter a choice");
            int choice = scanner.nextInt();
            if(choice==1){
                MessageDisplay.showMessage("Expenses cleared. Checked Out successfully");
                pendingExpenseStatus=1; //Expense cleared
            }
            else if(choice==2){
                MessageDisplay.showMessage("Expense not cleared. Can't checkout");
            }
        }
        else{
            MessageDisplay.showMessage("No Expenses found.\nCheckout Successfull");
        }


    }
}
