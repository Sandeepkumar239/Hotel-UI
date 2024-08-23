package com.ui.services;

import com.ui.interfaces.UserInputHandler;

import java.util.Scanner;

public class CancelBooking implements UserInputHandler {
    String contact;
    @Override
    public void collectInput(Scanner scanner){
        System.out.println("==========================================");
        System.out.println("            Cancel Booking");
        System.out.println("==========================================\n");
        System.out.println("Enter Contact : ");
        contact = scanner.nextLine();



    }
}
