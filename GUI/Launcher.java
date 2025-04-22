package GUI;

import javax.swing.SwingUtilities;
/**
 * Launchs the program
 * 
 * @author Reino Becker
 * @version 4/22/2025
 */
public class Launcher {
   public static void main( String[] args ){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameOne frame1 = new JFrameOne();   
            }
        });
   }
}
