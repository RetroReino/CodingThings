public class Year {

    private int year = 2025;

    public Year(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear( int year ) {
        this.year = year;
    }

    public String getYearString() {
        return Integer.toString( year );
    }

    public void printYear() {
        System.out.println("The year is: " + getYear());
    }
}