
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUI extends JPanel implements ActionListener {

	// This can be ignored for now...
	private static final long serialVersionUID = 1000L;

	// A GridLayout is a convenient way to organize the GUI components
	private GridLayout layout;

	// The GUI components are defined here
	private JButton button;
	private JTextField field;
	private JComboBox<String> box;
	private JLabel label;
	
	public MyGUI() {
		// Add the components of the GUI
		initComponents();

		// Place the GUI inside a window and show it on the screen
		JFrame frame = new JFrame( "My GUI" );
		frame.add( this );
		frame.pack();
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
		frame.setVisible( true );
	}

	private void initComponents() {
		// Initialize GUI components
		button = new JButton( "Press me!" );
		button.addActionListener( this );
		field = new JTextField();
		box = new JComboBox<String>( new String[] { "Option 1", "Option 2", "Option 3" } );
		label = new JLabel( "I am a label" );

		// Create a new layout
		layout = new GridLayout( 2, 2 );
		setLayout( layout );
		add( box    );
		add( label  );
		add( button );
		add( field  );
	}

	public void actionPerformed( ActionEvent evt ) {
		Airline airline = new Airline (field.getText());
		airline.printName();
	}

}
