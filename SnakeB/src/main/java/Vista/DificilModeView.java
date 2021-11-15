package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;

public class DificilModeView{

	private Font font = new Font("Agency FB", Font.BOLD, 20);
	private JFrame frame;
	private JPanel panel;
	private JTable table;
	private JButton nuevoJuego;
	private JButton record;
	private JLabel puntuacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DificilModeView window = new DificilModeView();
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
	public DificilModeView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Snake");
		frame.setBounds(100, 100, 343, 245);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 26, 160, 160);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		DefaultTableModel model = new DefaultTableModel();
		for (int i = 0; i < 10; i++) {
			model.addColumn("");
			for (int j = 0; j < 10; j++) {
				model.addRow(new Vector<>());
			}
		}
		table.setModel(model);
		//table.setDefaultRenderer( Object.class, new MiRender(10) );
		panel.add(table, gbc_table);
		
		nuevoJuego = new JButton("Nuevo Juego");
		nuevoJuego.setBounds(180, 90, 121, 23);
		frame.getContentPane().add(nuevoJuego);
		
		record = new JButton("Récords");
		record.setBounds(180, 142, 121, 23);
		frame.getContentPane().add(record);
		
		puntuacion = new JLabel("Puntuación:");
		puntuacion.setBounds(180, 26, 121, 35);
		puntuacion.setFont(font);
		frame.getContentPane().add(puntuacion);
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getNuevoJuego() {
		return nuevoJuego;
	}

	public void setNuevoJuego(JButton nuevoJuego) {
		this.nuevoJuego = nuevoJuego;
	}

	public JButton getRecord() {
		return record;
	}

	public void setRecord(JButton record) {
		this.record = record;
	}

	public JLabel getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(JLabel puntuacion) {
		this.puntuacion = puntuacion;
	}
}
