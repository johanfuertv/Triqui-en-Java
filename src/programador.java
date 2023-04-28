
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class programador extends JFrame {
	
	public programador() {
		super("Instrucciones ");
		setSize(400, 200);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		crearGUI();
		setVisible(true);
		JOptionPane.showMessageDialog(rootPane, "Datos del programador");
		JLabel progra = new JLabel("Johan Ossa 2257642-2724",JLabel.CENTER);
	}

	public void crearGUI() {
		JLabel programalabel = new JLabel("Johan Ossa Serna 2257642-2724");
		programalabel.setBounds(50, 50, 300, 20);
		add(programalabel);
		
	}

}
