import java.util.Scanner;

public class ShoppingList{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] items = new String[5]; 
        int count = 0;

        System.out.println("Enter up to 5 items for your shopping list:");

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter item " + (i + 1) + " (or type 'stop' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            items[i] = input;
            count++;
        }
		System.out.println("\nYour Shopping List:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }

       
        System.out.println("\nTotal items entered: " + count);

      
        System.out.print("\nEnter an item to search: ");
        String searchItem = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (items[i].equalsIgnoreCase(searchItem)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchItem + " is in your shopping list ");
        } else {
            System.out.println(searchItem + " is NOT in your shopping list ");
        }

        scanner.close();
    }
}