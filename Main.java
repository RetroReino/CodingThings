public class Main{
    
    public static Year year = new Year(2025);
    public static ages age = new ages();
    public static int num = ( 100 + 1000000 + (Integer.parseInt(" 20 + 20 ") + 20 + 30 / 10 ) );
    public static void main(String[] args){
        System.out.println( "would you like to use born Y/N?" );
        String answer = System.console().readLine();
        if( answer.equals("Y") || answer.equals("y") ){
            born();
            return;
        }
        else{
            System.out.println( "you have chosen not to be born." + "\n" + "...goodbye." + "\n" +
             "This is the end of the program." + "\n" + "Just kidding, :)" + "\n" +
             "Would you like to use the stretch class Y/N?" );
            answer = System.console().readLine().indexOf("Y") > -1 ? "Y" : "N";
            if( answer.equals("Y") || answer.equals("y") ){
                Stretch stretch = new Stretch();
                stretch.calcStretch();
                return;
            }
       
        }

        System.out.println( year.getYear() );
        year.getYearString();
        year.printYear();
        System.out.println( "This is the end of the program." );
        System.out.println( trice.triple(40) );
    
}
private static void born(){
    int life = 0;
    System.out.println( "What year were you born?" );
    try {   // try and catch is used to catch errors in the program
        // parseint is used to convert a string to an integer
        year.setYear( Integer.parseInt( System.console().readLine() ) ); // parseint is used to convert a string to an integer
    } catch (NumberFormatException e) { // if there is an error then the program will print this message
        System.out.println( "Please enter a valid integer." );
        year.setYear( Integer.parseInt( System.console().readLine() ) );
    }
    finally{ // finally is used to execute code after the try and catch block
        System.out.println( "You were born in " + year.getYear() );
    }
    System.out.println( "How old are you?" );
    try {
        life = Integer.parseInt( System.console().readLine() );
    } catch (NumberFormatException e) {
        System.out.println( "Please enter a valid integer." );
    }
    age.calcAge( year, life );
    year.printYear();
    
}

public void calcStretch(){
    System.out.println( "This is testing superclasses, overrides and extend and is useless." );
    System.out.println( "100" + 100 );
}
}
