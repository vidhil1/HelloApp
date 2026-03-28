public class HelloApp_Uc4 {
    public static void main(String[] args) {
        String name;

        if (args.length > 0) {
            // Use StringBuilder to efficiently join multiple names
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                // Add a comma and space, but NOT after the last name
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        } else {
            // Fallback to default if no names provided
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}
