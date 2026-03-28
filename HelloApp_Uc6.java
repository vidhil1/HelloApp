public class HelloApp_Uc6 {
    public static void main(String[] args) {
        String finalGreeting;

        if (args.length == 0) {
            finalGreeting = "Hello, World!";
        } else {
            StringBuilder sb = new StringBuilder();
            // 1. Append every name with a comma and space
            for (String name : args) {
                sb.append(name).append(", ");
            }
            
            // 2. Use substring to remove the very last ", " (last 2 characters)
            String allNames = sb.substring(0, sb.length() - 2);
            finalGreeting = "Hello, " + allNames + "!";
        }

        System.out.println(finalGreeting);
    }
}
