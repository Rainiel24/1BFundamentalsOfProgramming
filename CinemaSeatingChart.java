import java.util.Arrays;
    // Ini-import dito ang Arrays para magamit ang deepToString().
public class CinemaSeatingChart {
    // Ito ang pangalan ng ating class

    public static void main(String[] args) {
        // Dito nagsisimula ang program

        String[][] seats = {
                // Gumagawa ng 2D array na may 2 rows at 3 columns
                {"Alice", "Bob", "Charlie"},
                // Ito ang mga pangalan sa unang row
                {"David", "Emma", "Frank"}
                // Ito ang mga pangalan sa pangalawang row
        }; // Tapos na ang paglalagay ng data sa array

        System.out.println("Second Row, Third Seat: " + seats[1][2]);
        // Ipinapakita dito ang pangalan sa second row at third column
        seats[0][1] = "Vacant";
        // Pinapalitan ang pangalan ni Bob ng Vacant
        System.out.println("Updated Seating Chart: " + Arrays.deepToString(seats));
        // Ipinapakita ang buong seating arrangement sa isang line
    } // Dito natapos ang main method
} // Dito natapos ang class
