public class HelloApp_Uc5 {
    public static void main(String[] args) {
        String finalNames;

        if (args.length == 0) {
            finalNames = "World";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String name : args) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(name);
            }
            finalNames = sb.toString();
        }

        System.out.println("Hello, " + finalNames + "!");
    }
}
