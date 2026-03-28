public class HelloApp_Uc3 {
    public static void main(String[] args) {
        // 1. Set a default value
        String name = "World";

        // 2. Check if an argument was provided
        if (args.length > 0) {
            name = args[0]; // Override default with user input
        }

        // 3. Print the result
        System.out.println("Hello, " + name + "!");
    }
}
