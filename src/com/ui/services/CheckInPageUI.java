package com.ui.services;

import com.ui.interfaces.UserInputHandler;
import helper.MessageDisplay;

import java.util.Scanner;
public class CheckInPageUI implements UserInputHandler {
    private int checkInStatus = 0;
    private String aadhar;
    private String contact;
    @Override
    public void collectInput(Scanner scanner){
        System.out.println("================================================");
        System.out.println("         Checkin - Fill required details");
        System.out.println("================================================\n");
        System.out.println("Enter Aadhar no. : ");
        aadhar = scanner.nextLine();
        System.out.println("Enter Contact no : ");
        contact = scanner.nextLine();

        // to be called Himanshu's code
        this.checkInStatus= 1; // If checked in successful
        if(checkInStatus==1){
            MessageDisplay.showMessage("Checked In Successfull");
        }
        else{
            MessageDisplay.showMessage("Something went wrong. Check In failed\nPlease Retry ");
        }
    }
}
