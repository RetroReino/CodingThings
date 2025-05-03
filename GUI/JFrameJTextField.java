package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JFrameJTextField {

	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JLabel label;


	public JFrameJTextField(){
		initialize();
	}

	public void initialize(){
		frame =  new JFrame();
		frame.setTitle("JFrameOne");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize( 800, 500);
		frame.setLayout(new BorderLayout(10,10));
		frame.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("applogo.png");
		frame.setIconImage(icon.getImage());

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// --------Start of JTextField--------
		textField = createJTextField();
				panel.add(textField);
				
				label = new JLabel("");
				label.setFont(new Font( "Arial", Font.BOLD, 15));
				panel.add(label);
		
				frame.add(panel, BorderLayout.CENTER);
		
				frame.setVisible( true );
			}
		
			public JTextField createJTextField() {
				JTextField textField = new JTextField(20);

				textField.setFont( new Font("Arial", Font.BOLD, 24));

				textField.setForeground(Color.blue);

				textField.setBackground(Color.YELLOW);

				textField.setToolTipText("Enter Some Text");

				textField.setMargin(new Insets( 5, 10, 5, 10 )); //letters and inner field

				textField.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e){
						label.setText(textField.getText()); //takes the text entered into the text field and enters it into the label
						textField.setText("Enter Some More Text");
					}
					
				});

				return textField;
			}
		
			public void show(){

		
	}
}
