class Person {
    private final String name;
    private final int age;
    private final double weight;
    private final int height;
    private final String address;

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