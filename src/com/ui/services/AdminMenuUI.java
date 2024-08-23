package com.ui.services;
import com.ui.interfaces.DisplayMenu;

import java.util.Scanner;

public class AdminMenuUI implements DisplayMenu{
    private int choice;
    @Override
    public void displayMenu(){
        System.out.println("================================================");
        System.out.println("                 Admin Menu");
        System.out.println("================================================\n");
        System.out.println("1. Book a Room");
        System.out.println("2. Check Availabilty");
        System.out.println("3. CheckIn Customer");
        System.out.println("4. CheckOut Customer");
        System.out.println("5. Register Staff");
        System.out.println("6. Logout");
    }
    @Override
    public int getChoice(Scanner scanner)
    {
        System.out.println("Enter your choice : ");
        this.choice = scanner.nextInt();
        if(this.choice>=1 && this.choice<=6) {
            return this.choice;
        }
        else{
            System.out.println("Invalid choice.\nRe-enter valid choice");
            return getChoice(scanner);
        }
    }

}