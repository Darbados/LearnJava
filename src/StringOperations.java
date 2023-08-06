public class StringOperations {
    public static void main(String[] args) {
        String personName = "Charlie %s aged %d";
        System.out.println("Person " + personName.formatted("Charlstone", 25));
    }
}
