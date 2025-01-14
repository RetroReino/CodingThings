import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Time {
    private static Scanner in = new Scanner(System.in);
    public static void main( String[] args ){
        TimeUnit start = TimeUnit.SECONDS;
        System.out.println( "This is the time class." );
    }
    public void track( TimeUnit time ){
        long startTime = System.currentTimeMillis();
        System.out.println( "press a button to continue" );
        String answer = in.nextLine();
        if (answer != null) {
            long endTime = System.currentTimeMillis();
            int timeInSec = (int)( endTime - startTime ) / 1000;
            System.out.println( "You have waited" + timeInSec + "seconds." );
        }
        System.out.println( "current system time is " + time );
    }
    public void pause(){
        
    }
}
