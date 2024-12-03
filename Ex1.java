import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Append an element");
            System.out.println("2. Display all elements");
            System.out.println("3. Check if empty and clear the TreeSet");
            System.out.println("4. Remove an element");
            System.out.println("5. Get the number of elements");
            System.out.println("6. Find numbers less than a value");
            System.out.println("7. Create descending set, head set, and tail set");
            System.out.println("8. Check if TreeSet contains an element");
            System.out.println("9. Add elements from a collection");
            System.out.println("10. Get the first element");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to append: ");
                    int element = scanner.nextInt();
                    treeSet.add(element);
                    System.out.println("Element added.");
                    break;

                case 2:
                    System.out.println("TreeSet: " + treeSet);
                    break;

                case 3:
                    if (treeSet.isEmpty()) {
                        System.out.println("TreeSet is already empty.");
                    } else {
                        treeSet.clear();
                        System.out.println("TreeSet has been cleared.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the element to remove: ");
                    int toRemove = scanner.nextInt();
                    if (treeSet.remove(toRemove)) {
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 5:
                    System.out.println("Number of elements in TreeSet: " + treeSet.size());
                    break;

                case 6:
                    System.out.print("Enter a number to find elements less than it: ");
                    int limit = scanner.nextInt();
                    System.out.println("Numbers less than " + limit + ": " + treeSet.headSet(limit));
                    break;

                case 7:
                    System.out.println("Descending Set: " + treeSet.descendingSet());
                    System.out.print("Enter a number for Head Set (less than): ");
                    int headLimit = scanner.nextInt();
                    System.out.println("Head Set: " + treeSet.headSet(headLimit));
                    System.out.print("Enter a number for Tail Set (greater or equal): ");
                    int tailLimit = scanner.nextInt();
                    System.out.println("Tail Set: " + treeSet.tailSet(tailLimit));
                    break;

                case 8:
                    System.out.print("Enter the element to check: ");
                    int toCheck = scanner.nextInt();
                    if (treeSet.contains(toCheck)) {
                        System.out.println("TreeSet contains " + toCheck);
                    } else {
                        System.out.println("TreeSet does not contain " + toCheck);
                    }
                    break;

                case 9:
                    System.out.print("Enter elements to add (comma-separated): ");
                    scanner.nextLine(); 
                    String[] input = scanner.nextLine().split(",");
                    for (String s : input) {
                        treeSet.add(Integer.parseInt(s.trim()));
                    }
                    System.out.println("Elements added.");
                    break;

                case 10:
                    if (!treeSet.isEmpty()) {
                        System.out.println("First element: " + treeSet.first());
                    } else {
                        System.out.println("TreeSet is empty.");
                    }
                    break;

                case 11:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
