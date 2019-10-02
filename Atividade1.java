package atividade1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class Atividade1 {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnOk;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade1 window = new Atividade1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Atividade1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Text Fields
		TextField textField = new TextField();
		textField.setBounds(21, 37, 331, 22);
		frame.getContentPane().add(textField);

		textField_1 = new JTextField();
		textField_1.setBounds(21, 71, 331, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(21, 108, 331, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(21, 141, 331, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		//Labels
		label = new JLabel("1.");
		label.setBounds(10, 37, 46, 14);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2.");
		label_1.setBounds(10, 75, 46, 14);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3.");
		label_2.setBounds(10, 112, 46, 14);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("4.");
		label_3.setBounds(10, 145, 46, 14);
		frame.getContentPane().add(label_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 204, 364, 147);
		frame.getContentPane().add(separator);
		
		//Buttons
		btnNewButton = new JButton("1");
		btnNewButton.setBounds(21, 215, 331, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(21, 249, 331, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(21, 281, 331, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(21, 315, 331, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = textField.getText();
				String texto1 = textField_1.getText();
				String texto2 = textField_2.getText();
				String texto3 = textField_3.getText();
				
				btnNewButton.setText(texto);
				btnNewButton_1.setText(texto1);
				btnNewButton_2.setText(texto2);
				btnNewButton_3.setText(texto3);
				
			}
		});
		btnOk.setBounds(144, 174, 89, 23);
		frame.getContentPane().add(btnOk);
		
		//Buttons hint
		btnOk.setToolTipText("Mudar botões");
		btnNewButton.setToolTipText("Texto 1");
		btnNewButton_1.setToolTipText("Texto 2");
		btnNewButton_2.setToolTipText("Texto 3");
		btnNewButton_3.setToolTipText("texto 4");
	
	}
}