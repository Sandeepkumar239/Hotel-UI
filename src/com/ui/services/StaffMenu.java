package com.ui.services;

import com.ui.interfaces.DisplayMenu;

public class StaffMenu implements DisplayMenu {
    private int choice;
    @Override
    public void displayMenu(){
        System.out.println(" 1. Add Expenses");
        System.out.println(" 2. Logout");

    }
    @Override
    public int getChoice(Scanner scanner){
        this.choice = scanner.nextInt();
        if(choice!=1 && choice!=2){
            System.out.println("Enter a valid choice ");
            return getChoice(scanner);
        }
        return this.choice;
    }
}
