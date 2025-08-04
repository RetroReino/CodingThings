import java.awt.*;
import java.awt.geom.*;

import javax.sound.sampled.Line;
import javax.swing.*;

public class DrawingCanvas extends JComponent {

    private int width;
    private int height;
    private Cloud c1;
    private Cloud c2;
    private Cloud c3;
    
    public DrawingCanvas( int w, int h ) {
        width = w;
        height = h;
        c1 = new Cloud(10,50,75,Color.LIGHT_GRAY);
        c2 = new Cloud(200,75,90,Color.BLUE);
        c3 = new Cloud(420,60,85,Color.DARK_GRAY);
    }

    @Override
    protected void paintComponent( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING, //smooths the graphics
            RenderingHints.VALUE_ANTIALIAS_ON );
        g2d.setRenderingHints(rh);

        // Rectangle2D.Double r = new Rectangle2D.Double( 150, 200, 100, 100 );

        // AffineTransform reset = g2d.getTransform();

        // g2d.setColor(Color.GREEN);
        // g2d.rotate(Math.toRadians(15), 150, 200);
        // g2d.fill(r);

        // g2d.setTransform(reset);

        // g2d.setColor(Color.BLUE);
        // g2d.rotate(Math.toRadians(20), 150, 200);
        // g2d.fill(r);
    




        // Rectangle2D.Double r1 = new Rectangle2D.Double( 250, 200, 100, 100 );

        // g2d.rotate(Math.toRadians(15), 250, 200); //default pivot point is 0,0 of the jframe
        // g2d.fill(r1);





        // Rectangle2D.Double r1 = new Rectangle2D.Double( 0, 0, 100, 100 );
        // Rectangle2D.Double r2 = new Rectangle2D.Double( 100, 150, 100, 100 );
        // Rectangle2D.Double r3 = new Rectangle2D.Double( 50, 50, 100, 100 );

        // AffineTransform reset = g2d.getTransform(); //copys 0,0 transformation

        // g2d.setColor(Color.BLUE);

        // g2d.translate(150,100);
        // g2d.fill(r1);
        // g2d.fill(r2);

        // g2d.translate(300,200); //moves based on previous translation.
        // g2d.fill(r3);

        // AffineTransform at = g2d.getTransform(); // at = current transformations. aka remembers the transformation state

        // g2d.setTransform(reset);
        // //g2d.translate( -450,-300); //resets the translations so it goes back to 0,0
        // g2d.fill(r1);






        // Path2D.Double curve = new Path2D.Double();
        // curve.moveTo(250, 400 );
        // curve.curveTo( 350,300, 500,300, 600,400);
        // g2d.draw(curve);


        // Path2D.Double p = new Path2D.Double();
        // p.moveTo(100,300); //use moveTo to get the path's starting point / moveTo creates a line
        // p.lineTo(150,200); // drawing a line from one pint to the next
        // p.lineTo( 200, 300 );
        // p.closePath(); // creates a line to the last "moveTo" method call // close the line
        // g2d.draw(p); // you can use the .fill method to fill in the shape


        Ellipse2D.Double e1 = new Ellipse2D.Double( 0, 0, 100, 100);
        Path2D.Double p = new Path2D.Double();
        p.moveTo(0,50);
        p.lineTo(100,50);
        p.lineTo(50,50);
        p.lineTo(50,0);
        p.lineTo(50,100);

        g2d.setColor( Color.BLUE );
        g2d.fill( e1 );
        g2d.setColor( Color.BLACK );
        g2d.draw(p);

        g2d.translate( 50, 300 );

        c1.drawCloud(g2d);

        c2.drawCloud(g2d);


        c3.drawCloud(g2d);







        // Rectangle2D.Double r = new Rectangle2D.Double( 0, 0, width, height);
        // g2d.setColor( new Color( 100, 149, 237));
        // g2d.fill(r);

        // Ellipse2D.Double e = new Ellipse2D.Double( 200, 75, 100, 100 );
        // g2d.setColor( Color.BLUE );
        // g2d.fill(e);

        // Line2D.Double line = new Line2D.Double( 100, 250, 300, 75 );
        // g2d.setColor( Color.BLACK );
        // g2d.draw(line);
    }

}
