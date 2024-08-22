package com.ui.services;

import com.ui.interfaces.UserInputHandler;
import java.util.Scanner;
public class CheckAvailabilityInputUI implements UserInputHandler {
    String checkIn;
    String checkOut;
    @Override
    public  void collectInput(Scanner scanner){
        checkIn = scanner.nextLine();
        checkOut = scanner.nextLine();

        // get Available Rooms detail from Himanshu's code

        RoomDetailsUI roomDetails = new RoomDetailsUI();
        roomDetails.renderResults();
    }
}
