package airGunCalculator;

import java.util.Locale;

/**
 *
 * @author Lucas Kita
 */
public class AirGunCalculator extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private javax.swing.JButton countEnergyButton;
	private javax.swing.JButton countMassGramButton;
	private javax.swing.JButton countSpeedMpsButton;
	private javax.swing.JLabel energyLabel;
	private javax.swing.JTextField energyTextF;
	private javax.swing.JLabel energyUnitLabel;
	private javax.swing.JTextField massGrainTextF;
	private javax.swing.JLabel massGrainUnitLabel;
	private javax.swing.JTextField massGramTextF;
	private javax.swing.JLabel massGramUnitLabel;
	private javax.swing.JLabel massLabel;
	private javax.swing.JTextField speedFpsTextF;
	private javax.swing.JLabel speedFpsUnitLabel;
	private javax.swing.JLabel speedLabel;
	private javax.swing.JTextField speedMpsTextF;
	private javax.swing.JLabel speedMpsUnitLabel;
	private javax.swing.JLabel titleLabel;
	// End of variables declaration
	/**
	 * Creates new form AirGunCalculator
	 */
	public AirGunCalculator() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		countSpeedMpsButton = new javax.swing.JButton();
		speedLabel = new javax.swing.JLabel();
		speedMpsTextF = new javax.swing.JTextField();
		speedFpsTextF = new javax.swing.JTextField();
		countMassGramButton = new javax.swing.JButton();
		massLabel = new javax.swing.JLabel();
		massGramTextF = new javax.swing.JTextField();
		massGrainTextF = new javax.swing.JTextField();
		countEnergyButton = new javax.swing.JButton();
		energyLabel = new javax.swing.JLabel();
		energyTextF = new javax.swing.JTextField();
		speedMpsUnitLabel = new javax.swing.JLabel();
		speedFpsUnitLabel = new javax.swing.JLabel();
		massGramUnitLabel = new javax.swing.JLabel();
		massGrainUnitLabel = new javax.swing.JLabel();
		energyUnitLabel = new javax.swing.JLabel();
		titleLabel = new javax.swing.JLabel();
		Locale.setDefault(Locale.US);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		countSpeedMpsButton.setText("COUNT");
		countSpeedMpsButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				countSpeedMpsButtonActionPerformed(evt);
			}
		});

		speedLabel.setText("Speed:");

		speedMpsTextF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		speedMpsTextF.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
		speedMpsTextF.setText("0");
		speedMpsTextF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				speedMpsTextFActionPerformed(evt);
			}
		});

		speedFpsTextF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		speedFpsTextF.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
		speedFpsTextF.setText("0");
		speedFpsTextF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				speedFpsTextFActionPerformed(evt);
			}
		});

		countMassGramButton.setText("COUNT");
		countMassGramButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				countMassGramButtonActionPerformed(evt);
			}
		});

		massLabel.setText("Pellet mas:");

		massGramTextF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		massGramTextF.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
		massGramTextF.setText("0");
		massGramTextF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				massGramTextFActionPerformed(evt);
			}
		});

		massGrainTextF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		massGrainTextF.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
		massGrainTextF.setText("0");
		massGrainTextF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				massGrainTextFActionPerformed(evt);
			}
		});

		countEnergyButton.setText("COUNT");
		countEnergyButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				countEnergyButtonActionPerformed(evt);
			}
		});

		energyLabel.setText("Energy:");

		energyTextF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		energyTextF.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
		energyTextF.setText("0");

		speedMpsUnitLabel.setText("m/s");

		speedFpsUnitLabel.setText("fps");

		massGramUnitLabel.setText("gram");

		massGrainUnitLabel.setText("grain");

		energyUnitLabel.setText("J");

		titleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		titleLabel.setText("AIR GUN CALCUATOR");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(energyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(massLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(speedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addComponent(countMassGramButton)
										.addGap(18, 18, 18)
										.addComponent(massGramTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(massGramUnitLabel).addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(massGrainTextF, javax.swing.GroupLayout.PREFERRED_SIZE,
														120, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(speedFpsTextF, javax.swing.GroupLayout.PREFERRED_SIZE,
														120, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(speedFpsUnitLabel).addComponent(massGrainUnitLabel)))
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup().addComponent(countEnergyButton)
												.addGap(18, 18, 18).addComponent(energyTextF))
										.addGroup(layout.createSequentialGroup().addComponent(countSpeedMpsButton)
												.addGap(18, 18, 18).addComponent(speedMpsTextF,
														javax.swing.GroupLayout.PREFERRED_SIZE, 120,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(speedMpsUnitLabel).addComponent(energyUnitLabel))))
								.addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(speedLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(countSpeedMpsButton)
								.addComponent(speedMpsTextF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(speedFpsTextF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(speedMpsUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(speedFpsUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(23, 23, 23).addComponent(massLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(countMassGramButton)
								.addComponent(massGramTextF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(massGrainTextF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(massGramUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(massGrainUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(24, 24, 24).addComponent(energyLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(countEnergyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(energyTextF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(energyUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { countEnergyButton, countMassGramButton, countSpeedMpsButton, energyLabel,
						energyTextF, massGrainTextF, massGramTextF, massLabel, speedFpsTextF, speedLabel,
						speedMpsTextF });

		pack();
	}// </editor-fold>

	private void countSpeedMpsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		speedMpsTextF.setText(Calculator.calculateSpeedMps(massGramTextF.getText(), energyTextF.getText()));
	}

	private void speedMpsTextFActionPerformed(java.awt.event.ActionEvent evt) {
		speedFpsTextF.setText(Calculator.toSpeedFps(speedMpsTextF.getText()));
	}

	private void speedFpsTextFActionPerformed(java.awt.event.ActionEvent evt) {
		speedMpsTextF.setText(Calculator.toSpeedMps(speedFpsTextF.getText()));
	}

	private void countMassGramButtonActionPerformed(java.awt.event.ActionEvent evt) {
		massGramTextF.setText(Calculator.calculateMassGram(speedMpsTextF.getText(), energyTextF.getText()));
	}

	private void massGramTextFActionPerformed(java.awt.event.ActionEvent evt) {
		massGrainTextF.setText(Calculator.toMassGrain(massGramTextF.getText()));
	}

	private void massGrainTextFActionPerformed(java.awt.event.ActionEvent evt) {
		massGramTextF.setText(Calculator.toMassGram(massGrainTextF.getText()));
	}

	private void countEnergyButtonActionPerformed(java.awt.event.ActionEvent evt) {
		energyTextF.setText(Calculator.calculateEnergy(speedMpsTextF.getText(), massGramTextF.getText()));
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AirGunCalculator.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AirGunCalculator.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AirGunCalculator.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AirGunCalculator.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AirGunCalculator().setVisible(true);
			}
		});
	}

}
