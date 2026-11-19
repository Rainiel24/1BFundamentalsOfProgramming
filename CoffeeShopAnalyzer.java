public class CoffeeShopAnalyzer {
    public static void main(String[] args) {

        //Dito ilalagay yung sales kada araw Monday hanggang Sunday
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};

        //Mga araw para mas madaling malaman kung anong araw yung sales
        String[] daysOfWeek = {
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"
        };

        //Ipapakita dito yung sales kada araw
        System.out.println("--- Daily Sales ---");
        for (int i = 0; i < weeklySales.length; i++) {
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }
        //Dito pagsasamahin lahat ng sales
        int totalSales = 0;
        for (int dailySale : weeklySales) {
            totalSales += dailySale;
        }

        //Kinukuha dito yung average sales kada araw
        double averageSales = (double) totalSales / weeklySales.length;

        System.out.println("\n--- Weekly Summary ---");
        System.out.println("Total Sales: " + totalSales + " cups");
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        //Dito hahanapin yung pinakamataas at pinakamababang sales
        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];

        //Dito muna ilalagay yung unang araw bilang starting value
        String bestDay = daysOfWeek[0];
        String worstDay = daysOfWeek[0];

        //Iche-check dito isa-isa kung may mas mataas o mas mababang sales
        for (int i = 1; i < weeklySales.length; i++) {

            //Kapag mas mataas yung sales papalitan natin yung maxSales
            if (weeklySales[i] > maxSales) {
                maxSales = weeklySales[i];
                bestDay = daysOfWeek[i];
            }
            //Kapag mas mababa yung sales papalitan natin yung minSales
            if (weeklySales[i] < minSales) {
                minSales = weeklySales[i];
                worstDay = daysOfWeek[i];
            }
        }
        //Ipapakita dito yung araw na may pinakamataas at pinakamababang sales
        System.out.println("\n--- Bests and Worsts ---");
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
    }
}
