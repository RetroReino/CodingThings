public class ages {
    int age = 0;
    Year year = new Year(2025);
    public void calcAge( Year year, int age)
    {
        year.setYear( year.getYear() + age );
        this.age = year.getYear();
        this.year = year;
    }
}
