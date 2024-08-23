package com.ui.services;

import com.ui.interfaces.UserInputHandler;

import java.util.Scanner;

public class SearchBooking implements UserInputHandler {
    String contact;
    @Override
    public void collectInput(Scanner scanner){
        System.out.println("==========================================");
        System.out.println("            Search Booking");
        System.out.println("==========================================\n");
        System.out.println("Enter Contact : ");
        contact = scanner.nextLine();
    }
}
