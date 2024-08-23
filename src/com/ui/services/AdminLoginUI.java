package com.ui.services;
import com.ui.interfaces.LoginUser;
import helper.PasswordMasker;
import java.io.Console;
import java.util.Scanner;
public class AdminLoginUI implements LoginUser {
    private String password;
    private int loginStatus = 0;

    @Override
    public int loginRequester() {
        System.out.println("\n==================================");
        System.out.println("         Admin Login");
        System.out.println("==================================\n");
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
            System.exit(1);
        }
            System.out.println("Enter Username : ");
        String username = scanner.nextLine();
            String password = PasswordMasker.readPassword(console, "Enter your password: ");

            //Call Admin login method;
            return 1;
        }
    }
