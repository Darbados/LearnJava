import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Create an ArrayList (which is a type of List)
        List<String> namesList = new ArrayList<>();

        // Add elements to the list
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");

        // Access and print elements in the list
        System.out.println("Names in the list:");
        for (String name : namesList) {
            System.out.println(name);
        }

        // Get the size of the list
        int size = namesList.size();
        System.out.println("Number of names in the list: " + size);

        // Remove an element from the list
        namesList.remove("Bob");

        // Check if an element exists in the list
        String nameToCheck = "Charlie";
        boolean exists = namesList.contains(nameToCheck);
        System.out.println("Name " + nameToCheck + " exists in the list: " + exists);
    }
}
