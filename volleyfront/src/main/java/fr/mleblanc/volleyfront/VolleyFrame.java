package fr.mleblanc.volleyfront;

import java.awt.Button;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fr.mleblanc.volleyfront.model.EnumCategorie;

public class VolleyFrame extends JFrame {
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtLicence;

	/**
	 * Constructeur.
	 */
	public VolleyFrame() {
		super("Logiciel d'Arnaud");
		getContentPane().setLayout(null);

		JLabel labelNom = new JLabel("Nom");
		labelNom.setBounds(46, 40, 185, 35);
		getContentPane().add(labelNom);

		JLabel labelPrenom = new JLabel("Prenom");
		labelPrenom.setBounds(46, 88, 185, 35);
		getContentPane().add(labelPrenom);

		JLabel labelNumeroLicence = new JLabel("Numero Licence");
		labelNumeroLicence.setBounds(46, 136, 185, 35);
		getContentPane().add(labelNumeroLicence);

		JLabel labelCategorie = new JLabel("Cat�gorie");
		labelCategorie.setBounds(46, 192, 185, 35);
		getContentPane().add(labelCategorie);

		txtNom = new JTextField();
		txtNom.setBounds(289, 40, 205, 35);
		getContentPane().add(txtNom);
		txtNom.setColumns(10);

		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(289, 88, 205, 35);
		getContentPane().add(txtPrenom);

		txtLicence = new JTextField();
		txtLicence.setColumns(10);
		txtLicence.setBounds(289, 136, 205, 35);
		getContentPane().add(txtLicence);

		JComboBox comboBoxCategorie = new JComboBox();
		comboBoxCategorie.addItem(EnumCategorie.BENJAMIN);
		comboBoxCategorie.setBounds(289, 192, 205, 35);
		getContentPane().add(comboBoxCategorie);

		Button buttonSave = new Button("Enregistrer");
		buttonSave.setBounds(46, 270, 185, 35);
		getContentPane().add(buttonSave);

		Button buttonReset = new Button("Effacer");
		buttonReset.setBounds(309, 270, 185, 35);
		getContentPane().add(buttonReset);
		this.init();
	}

	/**
	 * Initialisation.
	 */
	private void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(568, 365);
		this.setVisible(true);
		this.setResizable(false);
	}
}
