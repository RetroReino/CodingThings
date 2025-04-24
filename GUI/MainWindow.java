/**
 * This package contains classes and components related to the graphical user interface (GUI)
 * of the application. It is responsible for managing and displaying the main window and
 * other visual elements.
 */
package GUI;

import javax.swing.JFrame;

public class MainWindow {
	
	private JFrame window;

	public MainWindow() {
		window = new JFrame();
		window.setTitle( "Hello World!" );
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //makes the 'X' actually close the window
		window.setSize(800, 500); 
		window.setLocationRelativeTo(null); //centers window
	}

	public void show(){
		window.setVisible(true);
	}

}
