package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JFrameGridLayout {
	private JFrame frame;
	private JPanel panel;

	public JFrameGridLayout(){
		initialize();
	}

	public void initialize(){
		frame =  new JFrame();
		frame.setTitle("JFrameOne");

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize( 800, 500);
		frame.setLocationRelativeTo(null);

		panel = new JPanel( new GridLayout( 4, 5, 10, 10 ));
		/** if 0 rows, then the number or rows = number of components added to the layout*/

		for( int i = 1; i <= 20; i++ ){
			JButton button = new JButton( "Button" + Integer.toString( i));
			panel.add(button);
		}

		frame.add(panel);

		frame.pack();
		frame.setVisible( true );
	}
}
