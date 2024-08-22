package com.ui.services;

import com.ui.interfaces.UserInputHandler;
import java.util.Scanner;
public class addExpenseUI implements UserInputHandler {
    int roomNo;
    int typeOfMeal;
    @Override
    public void collectInput(Scanner scanner){
        System.out.println(" Enter room number : ");
        roomNo = scanner.nextInt();
        System.out.println("    Type of Service\n  1.Meal   2.Spa");
        typeOfMeal = scanner.nextInt();
        if(typeOfMeal!=1 && typeOfMeal!=2) {
            System.out.println("Please choose a valid point");

        }

    }
}
