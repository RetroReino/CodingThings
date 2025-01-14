import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Time {
    private static TimeUnit start = TimeUnit.SECONDS;
    private static Scanner in = new Scanner(System.in);
    public static void main( String[] args ){
        System.out.println( "This is the time class." );
        track( start );

        System.out.println( "current system time is " + start );
    }
    public static void track( TimeUnit time ){
        long startTime = System.currentTimeMillis();
        System.out.println( "press a button to continue" );
        String answer = in.nextLine() + "a";
        long endTime = System.currentTimeMillis();
        int timeInSec = (int)( endTime - startTime ) / 1000;
        System.out.println( "You have waited " + timeInSec + " " + start );
    }
    public static void pause(){
        
    }
    public void restart(){
        System.out.println( "would you like to restart the timer? Y/N" );
        String answer = System.console().readLine();
        if( answer.equals("Y") || answer.equals("y") ){
            start = TimeUnit.SECONDS;
        }
    }
}