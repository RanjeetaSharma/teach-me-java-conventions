package powerpackage;
public static class PowerFinder {
    public static void main(String[] args) {

        public static long powerOf (int base = 3, exponent = 4) {

            long result = 1;

            for (; exponent != 0; --exponent) {
                result *= base;
            }

            System.out.println("Answer = " + result);
        }

    }
}
