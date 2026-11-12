public class DailyTemperatureTracker {
    // Ito ang pangalan ng ating class.

    public static void main(String[] args) {
        // Dito nagsisimula ang program

        double[] temperatures = new double[5];
        // Gumagawa ng double array na may 5 na slots

        temperatures[0] = 32.5;
        // Nilalagay ang temperature ng unang araw
        temperatures[1] = 34.0;
        // Nilalagay ang temperature ng pangalawang araw
        temperatures[2] = 31.8;
        // Nilalagay ang temperature ng pangatlong araw
        temperatures[3] = 33.2;
        // Nilalagay ang temperature ng pang-apat na araw
        temperatures[4] = 35.1;
        // Nilalagay ang temperature ng panglimang araw

        System.out.println("Daily Temperatures:");
        // Ipinapakita dito ang heading

        for (int i = 0; i < temperatures.length; i++) {
            // Umiikot hanggang sa huling element ng array
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
            // Ipinapakita ang temperature bawat araw
        }
            // Dito na tapos ang for loop

        temperatures[2] = 32.0;
            // Ina-update ang temperature ng pangatlong araw.
        System.out.println("Updated Temperature for Day 3: " + temperatures[2]);
            // Ipinapakita ang bagong temperature ng pangatlong araw
    } // Dito na tapos ang main method
} // Dito na tapos ng class
