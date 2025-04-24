package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class JFrameOne {
	//* You can also extend JFrameOne with JFrame to get the same results*/
	private JFrame frame;

	public JFrameOne(){
		initialize();
	}

	public void initialize(){
		frame =  new JFrame();
		frame.setTitle("JFrameOne");

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize( 800, 500); //specified by pixels
		frame.setLocationRelativeTo(null);
		frame.setVisible( true );

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5)); //in pixels
		//* Layout starts in center with a 5 pixel verticle gap and 10 horozontal gap between components

		panel.setBackground(Color.RED);

		Button button = new Button("Button");
		panel.add(button);

		Button button2 = new Button("Button2");
		panel.add(button2);

		Button button3 = new Button("Button3");
		panel.add(button3);

		//panel.setPreferredSize(new Dimension( 250, 200 ));

		frame.add(panel, BorderLayout.EAST);

		this.frame.setVisible(true);
	}
}
