public class Main {

    public static void main(String[] args) {
        String cloudProvider = "Gcp";

        if (cloudProvider.equals("Gcp")) {
            System.out.println("Gcp Compute Engine");
            // other stuff
        } else if (cloudProvider.equals("Aws")) {
            System.out.println("Aws EC2");
            // other stuff
        }
    }
}
