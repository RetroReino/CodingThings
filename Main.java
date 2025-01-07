public class Main{

    static Year year = new Year(2025);

    public static void main(String[] args){
        System.out.println( year.getYear() );
        year.getYearString();
        year.printYear();
        System.out.println( "This is the end of the program." );
        System.out.println( Go.triple(40) );
    }
}