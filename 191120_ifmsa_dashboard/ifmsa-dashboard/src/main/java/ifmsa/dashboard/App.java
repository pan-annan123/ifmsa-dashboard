package ifmsa.dashboard;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App extends JFrame {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public App() {
		
	}

	public static void main( String[] args ) {
    	EventQueue.invokeLater(() -> {
    		new App();
    	});
    }
    
}
