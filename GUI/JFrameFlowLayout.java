package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JFrameFlowLayout{
	private JFrame frame;
	private JPanel panel;

	public JFrameFlowLayout(){
		initialize();
	}

	public void initialize(){
		frame =  new JFrame();
		frame.setTitle("JFrameOne");

		panel = new JPanel( new FlowLayout( FlowLayout.CENTER, 10, 5 ));
		panel.setBackground(Color.PINK);

		for( int i = 1; i <= 5; i++ ){
			JButton button = new JButton( "Button" + Integer.toString(i));
			panel.add(button);
		}

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize( 800, 500); //specified by pixels
		frame.setLocationRelativeTo(null);

		frame.add(panel, BorderLayout.NORTH);// buttons wrap around

		frame.setVisible( true );
	}
}
