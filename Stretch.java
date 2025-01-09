public class Stretch extends Main{
    double stretch = 0;
    public void calcStretch( Year year, int stretch )
    {
        year.setYear( year.getYear() + stretch );
        this.stretch = year.getYear();
        Main.year = year; // this is the same as this.year = year but in a stretch class
    }
    @Override
    public void calcStretch(){
        System.out.println( "Lets triple 40" );
        System.out.println( trice.triple(40) );
    }
}
