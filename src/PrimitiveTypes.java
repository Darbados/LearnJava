public class PrimitiveTypes {
    public static void main(String[] args) {
        byte age = 25;
        short salary = 30000;
        int population = 1000000;
        long worldPopulation = 7823213456L; // Note the 'L' suffix for long literals

        float pi = 3.14f; // Note the 'f' suffix for float literals
        double gravity = 9.81;

        char initial = 'A';
        boolean isRaining = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
        System.out.println("Initial: " + initial);
        System.out.println("Is Raining: " + isRaining);

        String str = "Hello, World!";

        char characterAtIndex3 = str.charAt(3); // Get the character at index 3
        System.out.println("Character at index 3: " + characterAtIndex3);

        char characterAtIndex8 = str.charAt(8); // Get the character at index 8
        System.out.println("Character at index 8: " + characterAtIndex8);

        char ch1 = 'A'; // Unicode code point of 'A' is U+0041
        char ch2 = '\uf642'; // Unicode code point of '🙂' (smiley face emoji) is U+1F642

        System.out.println(ch2);
    }
}
