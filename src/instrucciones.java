

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class instrucciones extends JFrame {
	
	public instrucciones() {
		super("Instrucciones ");
		setSize(600, 600);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.YELLOW); 
		setLayout(null);
		crearGUI();
		setVisible(true);
		JOptionPane.showMessageDialog(rootPane, "Hola, Bienvenido a las Instrucciones del juego");
		JLabel instru = new JLabel("Las instrucciones del triki son: Jugador vs Jugador o Jugador vs maquina",JLabel.CENTER);
	}

	public void crearGUI() {
		JLabel instruccionesLabel = new JLabel("<html>Hola, las instrucciones son las siguientes: El triqui se juega en un tablero de 3x3 casillas.<br><br>"
				+ "El primer jugador en hacer una fila, columna o diagonal de tres símbolos iguales gana.<br><br>"
				+ "Si todas las casillas del tablero se llenan y nadie ha ganado, el juego termina en empate.<br><br>"
				+ "Los jugadores se turnan para colocar sus símbolos en el tablero.<br><br>"
				+ "No se puede colocar un símbolo en una casilla que ya está ocupada.<br><br>"
				);
		instruccionesLabel.setBounds(50, 50, 300, 300);
		instruccionesLabel.setFont(instruccionesLabel.getFont().deriveFont(14.0f)); // ajustar el tamaño de la fuente
		add(instruccionesLabel);
	}

}
