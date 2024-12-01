public class Primes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Replace this statement with your code

        final int n = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[n + 1];
        int counter = 0;
        int present = 0;

        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            for (int j = i * i; j < n; j += i) {
                prime[j] = false;
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i < n; i++) {
            if (prime[i] == true) {
                counter++;
                System.out.println(i);
            }
        }
        present = 100 * counter / n;

        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + +present + "% are primes)");

    }
}