package com.ui.services;

import com.ui.interfaces.DisplayMenu;
import com.ui.interfaces.UserInputHandler;
import helper.MessageDisplay;

import java.util.Scanner;
public class BookRoomUI implements UserInputHandler {
    private String checkIn;
    private String checkOut;
    private String address;
    private String customerName;
    private String contact;
    private String deluxeRoomCount;
    private String standaredRoomCount;
    @Override
    public void collectInput(Scanner scanner){
        System.out.println("================================================");
        System.out.println("         Book Room - Fill required details");
        System.out.println("================================================\n");
        System.out.print("Enter CheckIn Date : ");
        checkIn = scanner.nextLine();
        System.out.print("Enter CheckOut Date : ");
        checkOut = scanner.nextLine();
        System.out.print("Enter Customer name: ");
        customerName = scanner.nextLine();
        System.out.print("Enter Customer Address: ");
        address= scanner.nextLine();
        System.out.print("Enter Customer contact no : ");
        contact = scanner.nextLine();
        System.out.println("Enter Standared room count: ");
        standaredRoomCount = scanner.nextLine();
        System.out.println("Enter Deluxe room count: ");
        deluxeRoomCount = scanner.nextLine();


        // to be called Himanshu's code

        //if booked successfully
        //Display Booking successfull method

        //else
        //go to admin menu

        int bookingStatus = 1;  /// If booking successfull
        if(bookingStatus==1){
            MessageDisplay.showMessage("Room Booked Successfull");
            MessageDisplay.showMessage("Returning to Admin Menu ");
        }
        else{
            MessageDisplay.showMessage("Booking Failed...");
            MessageDisplay.showMessage("Returning to Admin Menu ");
        }

    }
}
