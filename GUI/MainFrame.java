package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * This is being used during the border layout tutorial
 */
public class MainFrame {
	//* You can also extend JFrameOne with JFrame to get the same results*/
	private JFrame frame;

	public MainFrame(){
		initialize();
	}

	public void initialize(){
		frame =  new JFrame();
		frame.setTitle("JFrameOne");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize( 500, 400); //specified by pixels
		//frame.setLayout(new BorderLayout(5,5)); // does the same as below.
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(10);
		borderLayout.setVgap(10);
		frame.setLayout(borderLayout);


		frame.add( new JButton("NORTH"), BorderLayout.NORTH );
		frame.add( new JButton("WEST"), BorderLayout.WEST );
		frame.add( new JButton("EAST"), BorderLayout.EAST );
		frame.add( new JButton("SOUTH"), BorderLayout.SOUTH );
		frame.add( new JButton("CENTER"), BorderLayout.CENTER );

		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5)); //in pixels
		//* Layout starts in center with a 5 pixel verticle gap and 10 horozontal gap between components

		frame.add(panel, BorderLayout.EAST);

		this.frame.setVisible(true);
	}
}
