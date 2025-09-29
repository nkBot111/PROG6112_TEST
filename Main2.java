import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Get input
        System.out.print("The cricketer name: ");
        String name = sc.nextLine();

        System.out.print("Enter the stadium: ");
        String stadium = sc.nextLine();

        System.out.print("Enter the total runs scored by " + name + " at " + stadium + ": ");
        int runs = sc.nextInt();

// Instantiate and print report
        CricketRunsScored crs = new CricketRunsScored(name, stadium, runs);
        crs.printReport();
    }
}