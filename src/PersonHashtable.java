import java.util.Hashtable;

public class PersonHashtable {
    public static void main(String[] args) {
        // Create a Hashtable to store persons' information
        Hashtable<String, Person> personsHashtable = new Hashtable<>();

        // Adding persons with their information
        personsHashtable.put("John", new Person("John", 30, 70.5, 175, "123 Main St"));
        personsHashtable.put("Alice", new Person("Alice", 25, 60.2, 160, "456 Elm St"));
        personsHashtable.put("Bob", new Person("Bob", 40, 80.0, 180, "789 Oak St"));

        // Define an array to hold the keys (names) of the hashtable
        String[] keysArray = new String[personsHashtable.size()];
        personsHashtable.keySet().toArray(keysArray);

        // Iterating over keys using keySet()
        for (String key : personsHashtable.keySet()) {
            Person person = personsHashtable.get(key);
            System.out.println("Key: " + key + ", Value: " + person);
        }

        for (int i = 0; i < keysArray.length; i++) {
            System.out.println("Element from keys: " + keysArray[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private double weight;
    private int height;
    private String address;

    public Person(String name, int age, double weight, int height, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight + "\n" +
                "Height: " + height + "\n" +
                "Address: " + address;
    }

    // Getters for the person's information
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getAddress() {
        return address;
    }
}
