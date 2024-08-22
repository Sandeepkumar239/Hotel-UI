package com.ui.services;

import com.ui.interfaces.UserInputHandler;
import java.util.Scanner;
public class CheckInPageUI implements UserInputHandler {
    String aadhar;
    String contact;
    @Override
    public void collectInput(Scanner scanner){
        aadhar = scanner.nextLine();
        contact = scanner.nextLine();

        // to be called Himanshu's code
    }
}
