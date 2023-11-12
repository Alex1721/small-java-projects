public class App {
    public static void main(String[] args) throws Exception {
        // q: what is the error here?
        // a: Calculator is not defined
        // q: show me how to fix it
        // a: import the Calculator class
        Calculator calculator = new Calculator();
        System.out.println("Hello, World!");
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.subtract(1, 2));
        System.out.println(calculator.multiply(1, 2));
        System.out.println(calculator.divide(1, 2));
    }
}
