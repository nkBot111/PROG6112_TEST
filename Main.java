public class Main {
    public static void main(String[] args) {

// 1D Arrays for names
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

// 2D array for runs [batsman][stadium]
        int[][] runs = {
                {5000, 3500, 6200}, // Jacques Kallis
                {3800, 3700, 5000}, // Hashim Amla
                {4200, 3900, 5200} // AB de Villiers
        };

// Report section
        System.out.println("-----------------------------------------------");
        System.out.println("RUNS SCORED REPORT");
        System.out.println("-----------------------------------------------");

// Print runs per batsman at each stadium
        for (int i = 0; i < batsmen.length; i++) {
            for (int j = 0; j < stadiums.length; j++) {
                System.out.println(batsmen[i] + " runs scored at " + stadiums[j] +
                        ": " + runs[i][j]);
            }
            System.out.println();
        }

// Total runs per stadium
        System.out.println("-----------------------------------------------");
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("-----------------------------------------------");

        int maxRuns = 0;
        String stadiumWithMost = "";

        for (int j = 0; j < stadiums.length; j++) {
            int total = 0;
            for (int i = 0; i < batsmen.length; i++) {
                total += runs[i][j];
            }
            System.out.println(stadiums[j].toUpperCase() + ": " + total);

// Check highest stadium
            if (total > maxRuns) {
                maxRuns = total;
                stadiumWithMost = stadiums[j];
            }
        }

// Stadium with most runs
        System.out.println("\nSTADIUM WITH THE MOST RUNS: " + stadiumWithMost.toUpperCase());
    }
}