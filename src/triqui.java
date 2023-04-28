

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class triqui extends javax.swing.JFrame {
	
    
    // Declaración de variables
    int juegos;          // Número de partidas jugadas
    int jx;              // Contador de victorias del jugador X
    int jo;              // Contador de victorias del jugador O
    int control = 1;     // Controla quién está jugando (1 = jugador X, 2 = jugador O)
    int contax = 0;      // Contador de jugadas ganadoras del jugador X
    int contao = 0;      // Contador de jugadas ganadoras del jugador O
    int conempate = 0;   // Contador de partidas empatadas
    int matriz[][] = new int[3][3];  // Tablero de juego representado como una matriz
    int multijugador = 3; // Indica si se juega contra el PC (0 = no, 1 = sí)
    int contjuegos = 0;  // Contador de partidas jugadas
    int numjuegos;       // Número de partidas a jugar
    JButton Jbinstrucciones,Jbprogramador;
    
    public triqui() {
        super("Triki");
        setSize(8000,8000);
        setLocationRelativeTo(null);
        setLayout(null);
        crearGUI();
        //getContentPane().setBackground(getBackground(Color.yellow));
        initComponents();

        // Se pregunta si se quiere jugar contra el PC y se ingresa el número de partidas a jugar
        multijugador = JOptionPane.showConfirmDialog(null, "Quieres jugar contra el PC?");
        numjuegos = Integer.parseInt(JOptionPane.showInputDialog("escriba el numero de partidas"));

        try {

            // Verificación de que se haya ingresado un número válido
            do {

            } while (numjuegos <= 0);
            {

            }

        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No es un valor valido");
        }

    }


	private void crearGUI() {
		// TODO Auto-generated method stub
		Jbinstrucciones = new JButton("Instrucciones");
		Jbinstrucciones.setBounds(425, 320, 120, 30);
		Jbinstrucciones.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				evento_Jbinstrucciones();
				
			}
		});
		playagain = new javax.swing.JButton();
		add(Jbinstrucciones);
		
		Jbprogramador = new JButton("Datos");
		Jbprogramador.setBounds(290, 320, 120, 30);
		Jbprogramador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				evento_Jbprogramador();
				
			}

			private void evento_Jbprogramador() {
				programador p1 = new programador();
				
			}
		});
		add(Jbprogramador);
	}

	public void evento_Jbinstrucciones() {
		instrucciones i1 = new instrucciones();
	}
	// Método generado automáticamente por la interfaz gráfica
    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        puntao = new javax.swing.JTextField();
        puntax1 = new javax.swing.JTextField();
        empate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
      
    
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		b2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b2ActionPerformed(evt);
			}
		});

		b1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b1ActionPerformed(evt);
			}
		});

		b3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b3ActionPerformed(evt);
			}
		});

		b6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b6ActionPerformed(evt);
			}
		});

		b5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b5ActionPerformed(evt);
			}
		});

		b4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b4ActionPerformed(evt);
			}
		});

		b9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b9ActionPerformed(evt);
			}
		});

		b8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b8ActionPerformed(evt);
			}
		});

		b7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b7ActionPerformed(evt);
			}
		});

		jLabel1.setText("JUGADOR X");

		jLabel2.setText("JUGADOR O");

		jLabel3.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
		jLabel3.setText("PUNTAJE ");

		jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
		jLabel4.setText("TRIQUI");

		puntao.setEnabled(false);

		puntax1.setEnabled(false);

		empate.setEnabled(false);

		jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
		jLabel5.setText("EMPATE");

		playagain.setText("PLAY AGAIN");
		playagain.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				playagainActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(40, 40, 40)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
								.createSequentialGroup().addGroup(layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
												layout.createSequentialGroup()
														.addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(34, 34, 34)
														.addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(31, 31, 31).addComponent(b6,
																javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(34, 34, 34)
												.addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(31, 31, 31).addComponent(b3,
														javax.swing.GroupLayout.PREFERRED_SIZE, 63,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(105, 105, 105).addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(puntax1)).addGap(46, 46, 46)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(puntao)))
										.addGroup(layout.createSequentialGroup().addGap(167, 167, 167).addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(empate))))
								.addContainerGap(116, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(34, 34, 34)
										.addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(31, 31, 31)
										.addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.DEFAULT_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(playagain).addGap(23, 23, 23))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(238, 238, 238).addComponent(jLabel3).addGap(172, 172, 172)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(playagain)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(52, 52, 52).addComponent(jLabel3)
										.addGap(26, 26, 26))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addContainerGap()
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18)))
								.addGroup(
										layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																b2, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(30, 30, 30)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(b6,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		b4, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		b5, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1).addComponent(jLabel2))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(puntao,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(puntax1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(28, 28, 28).addComponent(jLabel5)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(empate, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(28, 28, 28)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(87, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public void cierra(WindowEvent e) {
		int exit = JOptionPane.showConfirmDialog(null, "¿Te dejaras vencer facilmente?", "¿Seguro?",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		numjuegos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas partidas Deseas jugar?"));
	}

	private void empatejuego() {
		int acu = 0;

		for (int j = 0; j <= 2; j++) {

			for (int k = 0; k <= 2; k++) {
				acu = acu + matriz[j][k];

			}
		}
		if (acu == 1380 || acu == 1536) {

			JOptionPane.showMessageDialog(rootPane, "empate");
			conempate = conempate + 1;
			contjuegos = contjuegos + 1;
			String e = Integer.toString(conempate);
			empate.setText(e);
			borra();
		}

	}

	private void borra() {
		b1.setText("");
		b1.setEnabled(true);
		b2.setText("");
		b2.setEnabled(true);
		b3.setText("");
		b3.setEnabled(true);
		b4.setText("");
		b4.setEnabled(true);
		b5.setText("");
		b5.setEnabled(true);
		b6.setText("");
		b6.setEnabled(true);
		b7.setText("");
		b7.setEnabled(true);
		b8.setText("");
		b8.setEnabled(true);
		b9.setText("");
		b9.setEnabled(true);

		for (int x = 0; x <= 2; x++) {
			for (int i = 0; i <= 2; i++) {

				matriz[x][i] = 0;
			}
		}
	}

	private void borracompleto() {
		b1.setText("");
		b1.setEnabled(true);
		b2.setText("");
		b2.setEnabled(true);
		b3.setText("");
		b3.setEnabled(true);
		b4.setText("");
		b4.setEnabled(true);
		b5.setText("");
		b5.setEnabled(true);
		b6.setText("");
		b6.setEnabled(true);
		b7.setText("");
		b7.setEnabled(true);
		b8.setText("");
		b8.setEnabled(true);
		b9.setText("");
		b9.setEnabled(true);

		puntax1.setText(null);
		puntao.setText(null);
		empate.setText(null);

		contax = 0;
		contao = 0;
		conempate = 0;
		contjuegos = 0;

		for (int x = 0; x <= 2; x++) {
			for (int i = 0; i <= 2; i++) {

				matriz[x][i] = 0;
			}
		}

	}

	private void cuentadejuegos() {

		if (contjuegos == numjuegos) {

			b1.setText("");
			b1.setEnabled(false);
			b2.setText("");
			b2.setEnabled(false);
			b3.setText("");
			b3.setEnabled(false);
			b4.setText("");
			b4.setEnabled(false);
			b5.setText("");
			b5.setEnabled(false);
			b6.setText("");
			b6.setEnabled(false);
			b7.setText("");
			b7.setEnabled(false);
			b8.setText("");
			b8.setEnabled(false);
			b9.setText("");
			b9.setEnabled(false);

			JOptionPane.showMessageDialog(null, "JUEGO FINALIZADO");
		}

	}

	private void contx() {
		contax = contax + 1;
		String x = Integer.toString(contax);
		puntax1.setText(x);

	}

	private void conto() {
		contao = contao + 1;
		String o = Integer.toString(contao);
		puntao.setText(o);

	}

	private void linea1() {
		if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 252) {
			JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
			contjuegos = contjuegos + 1;
			contx();
			borra();
			cuentadejuegos();
		}
		if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 720) {
			JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
			contjuegos = contjuegos + 1;
			conto();
			borra();
			cuentadejuegos();
		}

	}

	private void linea2() {
		if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 252) {
			JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
			contjuegos = contjuegos + 1;
			contx();
			borra();
			cuentadejuegos();
		}
		if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 720) {
			JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
			contjuegos = contjuegos + 1;
			conto();
			borra();
			cuentadejuegos();
		}
	}

	private void linea3() {
		if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 252) {
			JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
			contjuegos = contjuegos + 1;
			contx();
			borra();
			cuentadejuegos();
		}
		if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 720) {
			JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
			contjuegos = contjuegos + 1;
			conto();
			borra();
			cuentadejuegos();
		}
	}

	private void linea4() {
		int acu = 0;
		for (int x = 0; x <= 2; x++) {

			acu = acu + matriz[x][0];

			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
				contjuegos = contjuegos + 1;
				contx();
				borra();
				cuentadejuegos();
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
				contjuegos = contjuegos + 1;
				conto();
				borra();
				cuentadejuegos();
			}
		}
	}

	private void linea5() {
		int acu = 0;
		for (int x = 0; x <= 2; x++) {

			acu = acu + matriz[x][1];

			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
				contjuegos = contjuegos + 1;
				contx();
				borra();
				cuentadejuegos();
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
				contjuegos = contjuegos + 1;
				conto();
				borra();
				cuentadejuegos();
			}
		}
	}

	private void linea6() {
		int acu = 0;
		for (int x = 0; x <= 2; x++) {

			acu = acu + matriz[x][2];

			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
				contjuegos = contjuegos + 1;
				contx();
				borra();
				cuentadejuegos();
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
				contjuegos = contjuegos + 1;
				conto();
				borra();
				cuentadejuegos();
			}
		}
	}

	private void lineaformx() {
		int acu = 0;
		for (int x = 0; x <= 2; x++) {

			acu = acu + matriz[x][x];
			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
				contjuegos = contjuegos + 1;
				contx();
				borra();
				cuentadejuegos();
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
				contjuegos = contjuegos + 1;
				conto();
				borra();
				cuentadejuegos();
			}

		}
	}

	private void lineaformx2() {

		int acu = 0;

		int cont = 2;

		for (int i = 0; i <= 2; i++) {

			acu = acu + matriz[cont][i];
			cont = cont - 1;

			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
				contjuegos = contjuegos + 1;
				contx();
				borra();
				cuentadejuegos();
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
				contjuegos = contjuegos + 1;
				conto();
				borra();
				cuentadejuegos();
			}
		}
	}

	private void b1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b1ActionPerformed

		if (control == 1) {
			b1.setText("X");
			matriz[0][0] = 84;
			control = 2;
			b1.setEnabled(false);
		} else {
			b1.setText("O");
			matriz[0][0] = 240;
			control = 1;
			b1.setEnabled(false);
		}

		if (multijugador == 0) {

			devolverjuego();
		}

		empatejuego();
		linea1();
		linea4();
		lineaformx();
		cuentadejuegos();
	}// GEN-LAST:event_b1ActionPerformed

	private void b2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b2ActionPerformed

		if (control == 1) {
			b2.setText("X");
			matriz[0][1] = 84;
			control = 2;
			b2.setEnabled(false);
		} else {

			b2.setText("O");

			matriz[0][1] = 240;
			control = 1;
			b2.setEnabled(false);

		}

		if (multijugador == 0) {

			devolverjuego();
		}
		empatejuego();
		linea1();
		linea5();
		lineaformx();
		cuentadejuegos();
	}// GEN-LAST:event_b2ActionPerformed

	private void b3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b3ActionPerformed

		if (control == 1) {
			b3.setText("X");

			matriz[0][2] = 84;
			control = 2;
			b3.setEnabled(false);

		} else {
			b3.setText("O");
			matriz[0][2] = 240;
			control = 1;

			b3.setEnabled(false);
		}

		if (multijugador == 0) {

			devolverjuego();
		}
		empatejuego();
		linea1();
		linea2();
		linea4();
		lineaformx();
		linea6();

		lineaformx2();
	}// GEN-LAST:event_b3ActionPerformed

	private void b4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b4ActionPerformed

		if (control == 1) {
			b4.setText("X");

			matriz[1][0] = 84;
			control = 2;
			b4.setEnabled(false);

		} else {
			b4.setText("O");
			matriz[1][0] = 240;
			control = 1;
			b4.setEnabled(false);
		}
		if (multijugador == 0) {

			devolverjuego();
		}
		empatejuego();
		linea2();
		linea4();
		lineaformx();
		linea6();
	}// GEN-LAST:event_b4ActionPerformed

	private void b5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b5ActionPerformed

		if (control == 1) {
			b5.setText("X");

			matriz[1][1] = 84;
			control = 2;
			b5.setEnabled(false);
		} else {
			b5.setText("O");
			matriz[1][1] = 240;
			control = 1;

			b5.setEnabled(false);

		}
		if (multijugador == 0) {

			devolverjuego();
		}

		empatejuego();
		linea2();
		linea5();
		lineaformx();
		lineaformx2();
	}// GEN-LAST:event_b5ActionPerformed

	private void b6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b6ActionPerformed

		if (control == 1) {
			b6.setText("X");

			matriz[1][2] = 84;
			control = 2;
			b6.setEnabled(false);
		} else {
			b6.setText("O");
			matriz[1][2] = 240;
			control = 1;

			b6.setEnabled(false);
		}
		if (multijugador == 0) {

			devolverjuego();
		}

		empatejuego();
		linea2();
		linea4();
		linea6();
		lineaformx();
		cuentadejuegos();
	}// GEN-LAST:event_b6ActionPerformed

	private void b7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b7ActionPerformed

		if (control == 1) {
			b7.setText("X");

			matriz[2][0] = 84;
			control = 2;
			b7.setEnabled(false);
		} else {
			b7.setText("O");
			matriz[2][0] = 240;
			control = 1;
			b7.setEnabled(false);
		}
		if (multijugador == 0) {

			devolverjuego();
		}
		empatejuego();
		linea3();
		linea4();
		lineaformx();
		lineaformx2();
	}// GEN-LAST:event_b7ActionPerformed

	private void b8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b8ActionPerformed

		if (control == 1) {
			b8.setText("X");

			matriz[2][1] = 84;
			control = 2;
			b8.setEnabled(false);
		} else {
			b8.setText("O");
			matriz[2][1] = 240;
			control = 1;

			b8.setEnabled(false);
		}
		if (multijugador == 0) {

			devolverjuego();
		}
		empatejuego();
		linea3();
		linea5();
		lineaformx();
	}// GEN-LAST:event_b8ActionPerformed

	private void b9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b9ActionPerformed

		if (control == 1) {
			b9.setText("X");

			matriz[2][2] = 84;
			control = 2;
			b9.setEnabled(false);
		} else {
			b9.setText("O");
			matriz[2][2] = 240;
			control = 1;

			b9.setEnabled(false);
		}
		if (multijugador == 0) {

			devolverjuego();
		}
		empatejuego();
		linea3();
		linea4();
		linea6();
		lineaformx();
	}// GEN-LAST:event_b9ActionPerformed

	 private void playagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

	        borracompleto();
	        multijugador = JOptionPane.showConfirmDialog(null, "Quieres jugar contra el PC?");
	        numjuegos = Integer.parseInt(JOptionPane.showInputDialog("escriba el numero de partidas"));

	    }//GEN-LAST:event_jButton1ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) { //AQUI ES EL MAIN
		triqui eb = new triqui();
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Metal".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new triqui().setVisible(true);
			}
		});
	}

	public void devolverjuego() {
		int randomNum = 0;
		boolean encontro = false;
		System.out.println("el ramdom");
		do {
			randomNum = 1 + (int) (Math.random() * 9);
			System.out.println("el ramdom es " + randomNum);

			switch (randomNum) {
			case 1:
				empatejuego();
				if (b1.isEnabled() == true) {
					b1.setText("O");
					matriz[0][0] = 240;
					control = 1;
					b1.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();
				}
				break;
			case 2:
				empatejuego();
				if (b2.isEnabled() == true) {
					b2.setText("O");

					matriz[0][1] = 240;
					control = 1;
					b2.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();

				}
				break;
			case 3:
				empatejuego();
				if (b3.isEnabled() == true) {
					b3.setText("O");
					matriz[0][2] = 240;
					control = 1;

					b3.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();
				}
				break;

			case 4:
				empatejuego();
				if (b4.isEnabled() == true) {
					b4.setText("O");
					matriz[1][0] = 240;
					control = 1;
					b4.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();
				}
				break;
			case 5:
				empatejuego();
				if (b5.isEnabled() == true) {
					b5.setText("O");
					matriz[1][1] = 240;
					control = 1;
					b5.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();
				}
				break;

			case 6:
				empatejuego();
				if (b6.isEnabled() == true) {
					b6.setText("O");
					matriz[1][2] = 240;
					control = 1;
					b6.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();
				}
				break;
			case 7:
				empatejuego();
				if (b7.isEnabled() == true) {
					b7.setText("O");
					matriz[2][0] = 240;
					control = 1;
					b7.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();
				}
				break;
			case 8:
				empatejuego();
				if (b8.isEnabled() == true) {
					b8.setText("O");
					matriz[2][1] = 240;
					control = 1;
					b8.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();
				}
				break;
			case 9:
				empatejuego();
				if (b9.isEnabled() == true) {
					b9.setText("O");
					matriz[2][2] = 240;
					control = 1;
					b9.setEnabled(false);
					encontro = true;
					linea1();
					linea2();
					linea4();
					lineaformx();
					linea6();
				}
				break;

			}
		} while (encontro == false);

	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton b1;
	private javax.swing.JButton b2;
	private javax.swing.JButton b3;
	private javax.swing.JButton b4;
	private javax.swing.JButton b5;
	private javax.swing.JButton b6;
	private javax.swing.JButton b7;
	private javax.swing.JButton b8;
	private javax.swing.JButton b9;
	private javax.swing.JTextField empate;
	private javax.swing.JButton playagain;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField puntao;
	private javax.swing.JTextField puntax1;
	// End of variables declaration//GEN-END:variables
}
