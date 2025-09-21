public class Assn2 {
    public static void main(String[] args) {

        if (args.length == 0) {
            Help.printHelp();
            return;
        }

        int i = 0;

        while (i < args.length) {
            String option = args[i];

            if (option.equals("-fib")) {
                if (i + 1 >= args.length || !Help.isInteger(args[i + 1])) {
                    System.out.println("Fibonacci valid range is [0, 40]");
                } else {
                    int n = Integer.parseInt(args[++i]);
                    if (n < 0 || n > 40) {
                        System.out.println("Fibonacci valid range is [0, 40]");
                    } else {
                        System.out.println("Fibonacci of " + n + " is " + Fib.fib(n));
                    }
                }

            } else if (option.equals("-fac")) {
                if (i + 1 >= args.length || !Help.isInteger(args[i + 1])) {
                    System.out.println("Factorial valid range is [0, 2147483647]");
                } else {
                    int n = Integer.parseInt(args[++i]);
                    if (n < 0) {
                        System.out.println("Factorial valid range is [0, 2147483647]");
                    } else {
                        System.out.println("Factorial of " + n + " is " + Fac.factorial(n));
                    }
                }

            } else if (option.equals("-e")) {
                if (i + 1 >= args.length || !Help.isInteger(args[i + 1])) {
                    System.out.println("Valid e iterations range is [1, 2147483647]");
                } else {
                    int n = Integer.parseInt(args[++i]);
                    if (n < 1) {
                        System.out.println("Valid e iterations range is [1, 2147483647]");
                    } else {
                        System.out.println("Value of e using " + n + " iterations is " + E.taylor(n));
                    }
                }

            } else {
                System.out.println("Unknown command line argument: " + option);
                Help.printHelp();
                System.exit(-1);
            }

            i++;
        }
    }
}
