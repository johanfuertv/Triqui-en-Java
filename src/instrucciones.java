

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class instrucciones extends JFrame {
	
	public instrucciones() {
		super("Instrucciones ");
		setSize(400, 200);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		crearGUI();
		setVisible(true);
		JOptionPane.showMessageDialog(rootPane, "Hola, Bienvenido a las Instrucciones del juego");
		JLabel instru = new JLabel("Las instrucciones del triki son: Jugador vs Jugador o Jugador vs maquina",JLabel.CENTER);
	}

	public void crearGUI() {
		JLabel instruccionesLabel = new JLabel("Hola, las instrucciones son las siguientes: jugador vs jugador");
		instruccionesLabel.setBounds(50, 50, 300, 20);
		add(instruccionesLabel);
		
	}

}
