import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Associate key and value");
            System.out.println("2. Copy HashMap to another");
            System.out.println("3. Search for a key or value");
            System.out.println("4. Get all keys and values");
            System.out.println("5. Get all key-value pairs");
            System.out.println("6. Delete all elements");
            System.out.println("7. Sort the HashMap by keys");
            System.out.println("8. Get the number of elements");
            System.out.println("9. Check if a key/value is present");
            System.out.println("10. Print HashMap using foreach loop");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key (integer): ");
                    int key = scanner.nextInt();
                    System.out.print("Enter value (string): ");
                    String value = scanner.next();
                    hashMap.put(key, value);
                    System.out.println("Key-value pair added.");
                    break;

                case 2:
                    HashMap<Integer, String> newHashMap = new HashMap<>(hashMap);
                    System.out.println("Copied HashMap: " + newHashMap);
                    break;

                case 3:
                    System.out.print("Enter key to search: ");
                    int searchKey = scanner.nextInt();
                    if (hashMap.containsKey(searchKey)) {
                        System.out.println("Key " + searchKey + " found with value: " + hashMap.get(searchKey));
                    } else {
                        System.out.println("Key " + searchKey + " not found.");
                    }
                    System.out.print("Enter value to search: ");
                    String searchValue = scanner.next();
                    if (hashMap.containsValue(searchValue)) {
                        System.out.println("Value \"" + searchValue + "\" is present in the HashMap.");
                    } else {
                        System.out.println("Value \"" + searchValue + "\" is not present.");
                    }
                    break;

                case 4:
                    System.out.println("All keys: " + hashMap.keySet());
                    System.out.println("All values: " + hashMap.values());
                    break;

                case 5:
                    System.out.println("All key-value pairs:");
                    for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                    }
                    break;

                case 6:
                    hashMap.clear();
                    System.out.println("All elements deleted.");
                    break;

                case 7:
                    TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);
                    System.out.println("Sorted HashMap by keys: " + sortedMap);
                    break;

                case 8:
                    System.out.println("Number of elements in HashMap: " + hashMap.size());
                    break;

                case 9:
                    System.out.print("Enter key to check: ");
                    int checkKey = scanner.nextInt();
                    if (hashMap.containsKey(checkKey)) {
                        System.out.println("Key " + checkKey + " is present.");
                    } else {
                        System.out.println("Key " + checkKey + " is not present.");
                    }
                    System.out.print("Enter value to check: ");
                    String checkValue = scanner.next();
                    if (hashMap.containsValue(checkValue)) {
                        System.out.println("Value \"" + checkValue + "\" is present.");
                    } else {
                        System.out.println("Value \"" + checkValue + "\" is not present.");
                    }
                    break;

                case 10:
                    System.out.println("Printing HashMap using foreach loop:");
                    hashMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
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
