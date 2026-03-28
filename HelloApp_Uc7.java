public class HelloApp {
    public static void main(String[] args) {
        // 1. Determine the 'names' part of the greeting
        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            // String.join takes the separator ", " and applies it BETWEEN names only
            names = String.join(", ", args);
        }

        // 2. Print the single final output
        System.out.println("Hello, " + names + "!");
    }
}
