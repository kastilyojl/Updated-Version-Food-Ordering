import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Scanner for user input
        Menu menu = new Menu(); // Create an instance of the Menu class

        home: // home label
        while(true) {

            System.out.println("\n\t\t----------Food Delivery----------\n");

            System.out.println("Food Delivery is easy as 1, 2, 3, 4...");
            System.out.println("Enjoy your food prepared by professional cooks specially 4 U.");
            System.out.println();

            menu.callTypeOfFoods(menu.getTypesOfFoods()); // Call method in Menu Class

            try { // Attempt to execute code that may throw an exception
                System.out.print("\nEnter Here: ");
                int types = scan.nextInt(); // User input

                switch (types) {
                    case 1:
                        menu.callSeafoodFish(menu.getSeafoodFish()); // Call method in Menu Class
                        Transaction.purchase(scan, types); // Call method in Transaction Class
                        break;
                    case 2:
                        menu.callMeatGrills(menu.getMeatGrills()); // Call method in Menu Class
                        Transaction.purchase(scan, types); // Call method in Transaction Class
                        break;
                    case 3:
                        menu.callPizza(menu.getPizza()); // Call method in Menu Class
                        Transaction.purchase(scan, types); // Call method in Transaction Class
                        break;
                    case 4:
                        menu.callSushiRolls(menu.getSushiRolls()); // Call method in Menu Class
                        Transaction.purchase(scan, types); // Call method in Transaction Class
                        break;
                    default:
                        continue home; // Skip to the next iteration of the home loop
                }

                retry: // retry label
                while(true) {
                    int again = 1;

                    while(again < 2 && again > 0) { // Condition if the input is 1 or 2
                        System.out.println("\nOrder Again? [1] Yes [2] Exit");
                        System.out.print("=> ");
                        again = scan.nextInt(); // User input
                        scan.nextLine();

                        if(again==1) {
                            continue home; // Skip to the next iteration of the home loop
                        } else if(again == 2) {
                            Transaction.receipt(scan);
                            break home; // Exit the loop
                        } else {
                            continue retry; // Skip to the next iteration of the retry loop
                        }
                    }
                }

            } catch (InputMismatchException e) { // Handle the exception
                System.out.println("\nNumbers Only!");
                scan.next();
            }

        }

    }
}