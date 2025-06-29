import javax.swing.JFrame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;


public class MyFrame extends JFrame{
    
    public MyFrame(){
        
        setSize( 640, 800 );
        setTitle( "WindowTitle" );
        
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e ) {
                System.exit(0);
            }
        });
        this.getContentPane().setBackground(Color.black);
        setVisible( true );
    }

    @Override
    public void paint( Graphics g ) {
        super.paint( g );

        Graphics2D g2d = (Graphics2D)g;
        //changes line sizes
        g2d.setStroke( new BasicStroke(5f));

        g.setColor(Color.red);
        g.drawLine(100, 100, 200, 110);

        g.setColor(Color.green);
        g.drawRect(100, 200, 50, 30);
        g.fillRect(200, 200, 50, 30);

        g.setColor(Color.BLUE);
        g.drawOval(100, 300, 50, 30);
        g.fillOval(200, 300, 50, 30);

        g.setColor(Color.YELLOW);
        g.drawArc(100, 400, 50, 30, 0, 180);
        g.fillArc(200, 400, 50, 30, 0, 180);

        g.setFont( g.getFont().deriveFont(120f)); // makes the string big

        String myString = "My String";
        FontMetrics fm = g.getFontMetrics(); //use to figure out the string size using the font of the string
        Rectangle2D fontBounds = fm.getStringBounds(myString, null);

        g.drawRect( 100, 500 - fm.getAscent() + fm.getDescent(), (int)fontBounds.getWidth(), (int)fm.getAscent());
        g.drawString( myString, 100, 500 );

    }

    public static void main( String[] args ) {
        new MyFrame();
    }
}
