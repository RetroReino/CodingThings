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


public class JFrameBasic {
	private JFrame frame;
	private JPanel panel;
	public JFrameBasic(){
		initialize();
	}

	public void initialize(){
		frame =  new JFrame();
		frame.setTitle("JFrameOne");

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize( 800, 500);
		frame.setLocationRelativeTo(null);

		frame.setVisible( true );
	}
}
