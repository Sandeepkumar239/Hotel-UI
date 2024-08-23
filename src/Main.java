import com.ui.interfaces.*;
import com.ui.services.*;
import helper.MessageDisplay;

import java.util.Scanner;
//public class Main
//{
//   // =============================main function========================================
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("***********************************");
//        System.out.println("   Welcome to the RKSHVA Hotel   ");
//        System.out.println("***********************************");
//        System.out.println();
//        displayeMenue(scanner);
//
//
//    }
//    //=================================main function ends/=====================================================
//
//    //=========================== Display main manue ==========================================================
//    private static void displayeMenue( Scanner scanner)
//    {
//        while (true) {
//
//            System.out.println("1) Admin login");
//            System.out.println("2) Staff login");
//            System.out.println("3) Exit");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    AdminLogin(scanner);
//                    break;
//                case 2:
//                    StaffLogin(scanner);
//                case 3:
//                    System.out.println("Thank you for using the RKSHVA Hotel. Goodbye!");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//    //=========================== Display main manue ==========================================================
//    private static  void AdminLogin(Scanner scanner)
//    {
//        AdminLoginUi obj = new AdminLoginUi();
//        int isuserloggedin = obj.adminLoginUI();
//
//        System.out.println("=========Login successful!============");
//        adminMenu(scanner);
//    }
//
//    private static void adminMenu(Scanner scanner)
//    {
//        while (true) {
//            System.out.println("===========================================");
//            System.out.println("\n---------Admin Menu------------");
//            System.out.println("1) Book a Room");
//            System.out.println("2) Check Availability of Empty Rooms");
//            System.out.println("3) Check In");
//            System.out.println("4) Check Out");
//            System.out.println("5) Approve Expense Requests");
//            System.out.println("6) Add new Staff");
//            System.out.println("7) Logout");
//            System.out.println("8) Return to main manue");
//            System.out.println("===========================================\n");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Booking a room...");
//                    // Booking logic here
//                    bookRoom(scanner);
//                    break;
//                case 2:
//                    System.out.println("Checking availability of empty rooms...");
//                    // Availability check logic here
//                    checkAvailableRooms(scanner);
//                    break;
//                case 3:
//                    System.out.println("Check In...");
//                    checkIn(scanner);
//                    break;
//                case 4:
//                    System.out.println("Check Out...");
//                    checkOut(scanner);
//                    break;
//                case 5:
//                    System.out.println("Approve Expense Requests...");
//                    approveExpense(scanner);
//                    break;
//                case 6:
//                    System.out.println("Logout..");
//                    logOut(scanner);
//                case 7:
//                    System.out.println("Returning to main manue....");
//                    displayeMenue(scanner);
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//
//
//    private static void newUserFlow(Scanner scanner) {
//        System.out.println("======== Please register as a staff or admin to proceed ======= \n\n");
//        System.out.println("Press 1 to register as Staff");
//        System.out.println("Press -1 to go back manue");
//        System.out.println("Press 0 to exit");
//        //Scanner cScanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        //int number = cScanner.nextInt();
//        if(number==1)
//        {
//            //newStaff = new regiserNewStaff();
//            //call functinons to assign details of new Staff
//            System.out.println("=================== New Staff registered succefully====================\n!");
//            System.out.println("=================== returning to the main manue========================\n");
//
//        }
//        else if(number == 0)
//        {
//            System.out.println("Thank you for using the RKSHVA Hotel. Goodbye!");
//            System.exit(0);
//        }
//        else if(number == -1)
//        {
//            displayeMenue(scanner);
//        }
//        else
//        {
//            System.out.println(" Error! Pealse enter valid input");
//            //registerNewUser();
//        }
//    }
//
//    private static void existingUserFlow(Scanner scanner) {
//        while(true)
//        {
//            System.out.println("Login as:");
//            System.out.println("1) Admin");
//            System.out.println("2) Staff");
//            System.out.println("3) Back to main menu");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    AdminLogin(scanner);
//                    break;
//                case 2:
//                    staffMenu(scanner);
//                    break;
//                case 3:
//                    displayeMenue(scanner);
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//
//
//    private static void bookRoom(Scanner scanner)
//    {
//
//    }
//
//    private static void staffMenu(Scanner scanner) {
//        while (true) {
//            System.out.println("\nStaff Menu:");
//            System.out.println("1) Manage Inventory");
//            System.out.println("2) Request Admin Approval");
//            System.out.println("3) Add Room Expenses");
//            System.out.println("4) Logout");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Managing inventory...");
//                    // Manage inventory logic here
//                    break;
//                case 2:
//                    System.out.println("Requesting admin approval...");
//                    // Request approval logic here
//                    break;
//                case 3:
//                    System.out.println("Adding room expenses...");
//                    // Add room expenses logic here
//                    break;
//                case 4:
//                    System.out.println("Logging out...");
//                    return;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//}


public class Main{
    static int choice;
    public static void main(String... args) {
        Scanner scanner = null;

        while (true) {

            System.out.println("==========================================");
            System.out.println("               Main Menu ");
            System.out.println("==========================================\n");

            System.out.println("1. Admin Login");
            System.out.println("2. Staff Login");
            System.out.println("3. Exit\n");

            System.out.println("Enter a choice : ");
            scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    LoginUser adminLogin = new AdminLoginUI();
                    int adminLoginStatus = adminLogin.loginRequester();
                    if(adminLoginStatus==1){
                        MessageDisplay.showMessage("Admin Login Successfull.....\n");
                    }
                    while(adminLoginStatus==1){
                        DisplayMenu adminMenu = new AdminMenuUI();
                        adminMenu.displayMenu();
                        scanner = new Scanner(System.in);
                        int menuChoice = adminMenu.getChoice(scanner);
                        if(menuChoice==1){
                            UserInputHandler InputCollector = new BookRoomUI();
                            scanner = new Scanner(System.in);
                            InputCollector.collectInput(scanner);
                        }
                        else if(menuChoice==2){
                            UserInputHandler InputCollector = new CheckAvailabilityInputUI();
                            scanner = new Scanner(System.in);
                            InputCollector.collectInput(scanner);
                        }
                        else if(menuChoice==3){
                            UserInputHandler InputCollector = new CheckInPageUI();
                            scanner = new Scanner(System.in);
                            InputCollector.collectInput(scanner);
                        }
                        else if(menuChoice==4){
                            UserInputHandler InputCollector = new CheckoutPageUI();
                            scanner = new Scanner(System.in);
                            InputCollector.collectInput(scanner);
                        }
                        else if(menuChoice==5){
                            RegisterUser staffRegister = new RegisterStaffUI();
                            staffRegister.register();
                        }
                        else if(menuChoice==6){
                            MessageDisplay.showMessage("Logout Successfull");
                            adminLoginStatus=0;
                        }
                    }
                    break;
                case 2:
                    LoginUser staffLogin = new StaffLoginUI();
                    int staffloginStatus = staffLogin.loginRequester();
                    if(staffloginStatus==1){
                        MessageDisplay.showMessage("Staff Logged In Successfull.....!");
                    }
                    while(staffloginStatus==1){
                        DisplayMenu staffMenu = new StaffMenuUI();
                        staffMenu.displayMenu();
                        int staffChoice = staffMenu.getChoice(scanner);
                        if(staffChoice==1){
                            UserInputHandler inputCollector = new addExpenseUI();
                            scanner = new Scanner(System.in);
                            inputCollector.collectInput(scanner);

                        }
                        else if(staffChoice==2){
                            staffloginStatus=0;
                        }
                        else{
                            MessageDisplay.showMessage("Invalid choice");
                            staffloginStatus=0;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the RKSHVA Hotel. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter a valid choice :");

            }
        }
    }
}