import java.util.Scanner;
import java.util.LinkedList;

public class Transaction extends Menu{

    private static final LinkedList<String> item = new LinkedList<>();
    private static final LinkedList<Integer> price = new LinkedList<>();
    private static double totalPrice = 0;

    public static void purchase(Scanner scanner, int types) {

        Menu menu = new Menu(); // Create an instance of the Menu class

        System.out.print("\nEnter Here: ");
        int items = scanner.nextInt(); // User input

        if(items > 0 && (items < menu.getSeafoodFish().length+1 || items < menu.getMeatGrills().length+1 ||
                items < menu.getPizza().length+1 || items < menu.getSushiRolls().length+1)) { // Condition to ensure the input is within the valid choices

            items = items-1;
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt(); // User input

            switch (types) {
                case 1:
                    item.offer(menu.getSeafoodFish()[items] +  " $ " + menu.getSeafoodFishPrice()[items] + " x " + quantity); // Add element to the collection
                    price.offer(menu.getSeafoodFishPrice()[items] * quantity); // Add element to the collection
                    break;
                case 2:
                    item.offer(menu.getMeatGrills()[items] + " $ " + menu.getMeatGrillsPrice()[items] + " x " + quantity); // Add element to the collection
                    price.offer(menu.getMeatGrillsPrice()[items] * quantity); // Add element to the collection
                    break;
                case 3:
                    item.offer(menu.getPizza()[items] + " $ " + menu.getPizzaPrice()[items] + " x " + quantity); // Add element to the collection
                    price.offer(menu.getPizzaPrice()[items] * quantity); // Add element to the collection
                    break;
                case 4:
                    item.offer(menu.getSushiRolls()[items] + " $ " + menu.getSushiRollsPrice()[items] + " x " + quantity); // Add element to the collection
                    price.offer(menu.getSushiRollsPrice()[items] * quantity); // Add element to the collection
                    break;
            }

            System.out.print("\nItems: $ ");
            if(!(item.isEmpty())) { // Check if the collection is not empty
                System.out.printf("%-10s\n",item.getLast().substring(2));
            }

            System.out.print("Total: ");
            if(!(price.isEmpty())) { // Check if the collection is not empty
                System.out.println(price.getLast());
            }
        } else { // Handle the invalid input
            System.out.println("Select from the choices only!");
            purchase(scanner, types); // recursion of the method
        }

    }

    private static void cart() {

        System.out.println("Items:");
        for (String collection : item) { // Iterate through each element in the collection
            System.out.println(collection.substring(2));
        }

        while(!(price.isEmpty())) { // If the collection is not empty, continue looping
            totalPrice = totalPrice + price.poll(); // Add elements from the queue to the total price until the queue is empty
        }
    }

    public static void receipt(Scanner scanner) {
        System.out.println("\n\t\t----------Food Deliver Receipt----------");
        System.out.println("*Note! We Only Accept Cash on Delivery as a Mode of Payment.");
        System.out.println();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine(); // User input
        System.out.print("Enter Address: ");
        String address = scanner.nextLine(); // User input

        System.out.println("\n\t\t----------Cart----------");

        cart();

        System.out.println("\nTotal Price: $ " + totalPrice);

        System.out.println("\nCustomer's Name: " + name);
        System.out.println("Delivery Address: " + address);

        closingText(); // Call closingText method
        item.clear(); // Remove all elements from the collection
        price.clear(); // Remove all elements from the collection
        System.exit(0); // Terminate the program
    }

    private static void closingText() {
        System.out.println("\n---Thank You! Come & Order Again <3.---");
    }

}
