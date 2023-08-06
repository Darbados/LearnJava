import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Generate an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank"};

        // Print the names in the array
        System.out.println("Names in the array:");
        for (String name : names) {
            System.out.println(name);
        }

        // Get the length of the array
        int length = names.length;
        System.out.println("Array length: " + length);

        // Access an element in the array using index
        int index = 2;
        if (index >= 0 && index < length) {
            String nameAtIndex = names[index];
            System.out.println("Name at index " + index + ": " + nameAtIndex);
        } else {
            System.out.println("Invalid index.");
        }

        // Check if a name exists in the array
        String searchName = "Eva";
        boolean nameExists = Arrays.asList(names).contains(searchName);
        System.out.println("Name " + searchName + " exists in the array: " + nameExists);

        // Find the index of a specific name
        int nameIndex = Arrays.asList(names).indexOf(searchName);
        if (nameIndex != -1) {
            System.out.println("Index of name " + searchName + ": " + nameIndex);
        } else {
            System.out.println("Name not found in the array.");
        }

        // Sort the array in alphabetical order
        Arrays.sort(names);
        System.out.println("Names after sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
