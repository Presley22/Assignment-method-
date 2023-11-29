public class Class {
    private int number;

    // Constructor
    public Class(int number) {
        this.number = number;
    }

    // Non-static method
    public void displayNumber() {
        System.out.println("Number: " + number);
    }

    // Static method 1
    public static void staticMethod1() {
        System.out.println("This is static method 1");
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("This is static method 2");
    }

    public static void main(String[] args) {
        // Creating an object of Class using the constructor
        Class obj = new Class(23);

        // Calling non-static method using the object
        obj.displayNumber();

        // Calling static methods directly
        staticMethod1();
        staticMethod2();
    }
}
