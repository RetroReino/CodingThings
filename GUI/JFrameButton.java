package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JFrameButton {
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public JFrameButton(){
		initialize();
	}
	
	public void initialize(){
		frame =  new JFrame();
		frame.setTitle("JFrameOne");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize( 800, 500);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		
		button = createButton();
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible( true );
	}
	
	private JButton createButton() {
		JButton button = new JButton("Print");
		button.setFocusable(false);

		// this adds an image to a button. 
		ImageIcon printIcon = new ImageIcon("print.png"); //also i dont have print.png right now
		button.setIcon(printIcon); // so the image is just gone and it says" P..."

		button.setIconTextGap(10); //gap between image and text

		button.setToolTipText("Some awesome text for the printer button");

		button.setFont( new Font("Ariel", Font.PLAIN, 24 ));

		button.setMargin(new Insets(10, 10, 10, 10));//space between button and text and graphic

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Print button has been clicked");
			}
			
		});

		//button.setEnabled(false);	////* unable to interact with the button

		button.doClick(); //autoclick the button 

		//continue here 10:34 through video

		button.setMnemonic(KeyEvent.VK_P);//press ALT + P and the button is clicked.
		
		return button;
	}
	
	public void show(){
		this.frame.setVisible(true);
	}
}
