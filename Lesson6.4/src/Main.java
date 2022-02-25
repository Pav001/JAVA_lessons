public class Main {
    public static void main(String[] args) {
        double[] temperature = new double[10];
        double a = 0;

        for (int i = 0; i < temperature.length; i++) {
            double value = 31 + (Math.random() * 10);
            temperature[i] = value;
            System.out.printf("%.1f ", temperature[i]);
        }
        for (int i = 0; i < temperature.length; i++) {
            a = (a + temperature[i]);
        }
        System.out.printf("\nAverage temperature in the hospital: %.1f", (a / temperature.length));
        int sum = 0;
        for (double v : temperature) {
            if (v >= 36.2 && v <= 36.94) {
                sum = sum + 1;
            }
        }
        System.out.println("\nHealthy: " + sum +" per");
    }
}
