package Boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entity.Rimborso;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import java.awt.Font;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCodiceProgramma;
	private JTextField textField_ID;
	private JLabel Risposta;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CodiceProgramma = new JLabel("Codice Programma");
		CodiceProgramma.setBackground(Color.WHITE);
		CodiceProgramma.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 14));
		CodiceProgramma.setForeground(Color.BLACK);
		CodiceProgramma.setBounds(40, 27, 135, 19);
		contentPane.add(CodiceProgramma);
		
		textFieldCodiceProgramma = new JTextField();
		textFieldCodiceProgramma.setBounds(40, 56, 96, 19);
		contentPane.add(textFieldCodiceProgramma);
		textFieldCodiceProgramma.setColumns(10);
		
		JLabel IDLabel = new JLabel("ID");
		IDLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 14));
		IDLabel.setBounds(40, 85, 45, 13);
		contentPane.add(IDLabel);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(40, 108, 96, 19);
		contentPane.add(textField_ID);
		textField_ID.setColumns(10);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 14));
		PasswordLabel.setForeground(Color.BLACK);
		PasswordLabel.setBounds(40, 137, 111, 19);
		contentPane.add(PasswordLabel);
		
		JButton BottoneRichiesta = new JButton("Richiedi Rimborso");
		BottoneRichiesta.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 14));
		BottoneRichiesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int codice=Integer.parseInt(textFieldCodiceProgramma.getText());
				
				
				String ID=textField_ID.getText();
				String Pass=passwordField.getText();
				
				String Esito=Control.ControllerRimborso.VerificaRimborso(codice, ID, Pass);
				Risposta.setVisible(true);
				if(Esito!=null) {
				   Risposta.setText(Esito);
				}
				else {
					Rimborso rimborso=new Rimborso();
					rimborso=Control.ControllerRimborso.HandlerRichiestaRimborso(codice, ID, Pass);
					Risposta.setText("Rimborso ottenuto di : € " + rimborso.getImporto());
				}
				
			}
				catch(Exception ex) {
					Risposta.setVisible(true);
					Risposta.setText("ERRORE: Inserire un Codice numerico");
					
				}
		}
			
			
		});
		BottoneRichiesta.setBounds(223, 165, 161, 21);
		contentPane.add(BottoneRichiesta);
		
		Risposta = new JLabel("Esito: ");
		Risposta.setBackground(Color.WHITE);
	    Risposta.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 14));
		Risposta.setBounds(40, 217, 289, 19);
		contentPane.add(Risposta);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(40, 166, 96, 19);
		contentPane.add(passwordField);
		Risposta.setVisible(false);
	}
}
