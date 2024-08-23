package com.ui.services;

import com.ui.interfaces.UserInputHandler;
import java.util.Scanner;
public class CheckAvailabilityInputUI implements UserInputHandler {
    String checkIn;
    String checkOut;
    @Override
    public  void collectInput(Scanner scanner){
        System.out.println("================================================");
        System.out.println("    Check Availabilty - Fill required details");
        System.out.println("================================================\n");
        System.out.println("Enter check in date : ");
        checkIn = scanner.nextLine();
        System.out.println("Enter check out date : ");
        checkOut = scanner.nextLine();

        // get Available Rooms detail from Himanshu's code

        RoomDetailsUI roomDetails = new RoomDetailsUI();
        roomDetails.renderResults();
    }
}
