
public class Person {
     private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // uses validation
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    // Returns a greeting message
    public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}

