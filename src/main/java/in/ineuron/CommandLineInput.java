package in.ineuron;

public class CommandLineInput {

    public static void main(String[] args) {
   
        if (args.length == 0) {
            System.out.println("No command-line inputs provided.");
        } else {
                      System.out.println("Received command-line inputs:");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
