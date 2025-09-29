// Abstract class
abstract class Cricket implements ICricket {
    protected String batsmanName;
    protected String stadiumName;
    protected int totalRuns;

    // Constructor
    public Cricket(String batsmanName, String stadiumName, int totalRuns) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRuns = totalRuns;
    }

    // Getters
    public String getBatsman() {
        return batsmanName;
    }

    public String getStadium() {
        return stadiumName;
    }

    public int getRunsScored() {
        return totalRuns;
    }
}