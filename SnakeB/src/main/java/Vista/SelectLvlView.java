package aceptaelreto.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class SelectLvlView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectLvlView window = new SelectLvlView();
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
	public SelectLvlView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 282, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Fácil(20x20)");
		rdbtnNewRadioButton.setBounds(68, 50, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Normal(15x15)");
		rdbtnNewRadioButton_1.setBounds(68, 90, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Difícil(10x10)");
		rdbtnNewRadioButton_2.setBounds(68, 132, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(26, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(151, 212, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
