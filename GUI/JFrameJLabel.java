package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class JFrameJLabel {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;


	public JFrameJLabel(){
		initialize();
	}

	public void initialize(){
		frame =  new JFrame();
		frame.setTitle("JFrameOne");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize( 800, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible( true );

		panel = new JPanel();
		panel.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
		panel.setBackground(Color.GRAY);
		frame.add(panel, BorderLayout.NORTH);

		//* A JLabel can have, text, a graphic, or an image */
		label = new JLabel("My Cool App");
		panel.add(label);

		label.setForeground(Color.WHITE); //changes the text color

		label.setFont( new Font( "Sans-serif", Font.BOLD, 36 ));

		ImageIcon lableIcon = new ImageIcon("logo.png");
		label.setIcon(lableIcon); // sets the icon/image

		label.setIconTextGap(10); //gap between icon and text

		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM); //like in the Jbutton tutorial

		button = new JButton( "Update Label Text" );
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed( ActionEvent e ){
				label.setText("<html>My Cool App <br> Buy it now <html>");
			}
		});

		frame.add(button, BorderLayout.SOUTH); //this button updates the text from "My Cool App" to "Buy it now"

	}

	public void show(){
		frame.setVisible(true);
	}
}
