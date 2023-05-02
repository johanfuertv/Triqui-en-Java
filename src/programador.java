
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class programador extends JFrame {
	
	public programador() {
		super("Datos del Programador ");
		setSize(1000, 1000);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		crearGUI();
		setVisible(true);
		JOptionPane.showMessageDialog(rootPane, "Datos del programador");
	}

	public void crearGUI() {
		JLabel programalabel = new JLabel("Johan Ossa Serna 2257642", SwingConstants.CENTER);
		programalabel.setBounds(0, 50, 400, 20);
		programalabel.setFont(new Font("Arial", Font.BOLD, 28));
		programalabel.setForeground(Color.WHITE);
		add(programalabel);
		ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/caballero-jugando-triqui.jpg"));
		JLabel imagenLabel = new JLabel(imagen);
		imagenLabel.setBounds(0, 0, getWidth(), getHeight());
		imagenLabel.setHorizontalAlignment(JLabel.CENTER);
		imagenLabel.setVerticalAlignment(JLabel.CENTER);
		add(imagenLabel);
		
	}

}
