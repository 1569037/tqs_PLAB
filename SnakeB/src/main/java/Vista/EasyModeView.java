package Vista;

import Controller.Controller;
import Model.*;

import java.awt.*;

import javax.swing.JFrame;
//import javax.swing.table.DefaultTableCellRenderer;
//import java.awt.Component;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EasyModeView {

	private Font font = new Font("Agency FB", Font.BOLD, 20);
	private JFrame frame;
	private static JPanel panel;
	private JTable table;
	private JButton nuevoJuego;
	private JButton record;
	private JLabel serpiente, base;
	private ImageIcon icon;
	private Controller c;

	/**
	 * Create the application.
	 */
	public EasyModeView(Controller c) {
		this.c = c;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Snake");
		frame.setBounds(100, 100, 515, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel(){
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				drawSnake(g,c.getSer());
				drawFood(g,c.getGame().getComida());
			}
		};
		panel.setBounds(10, 26, 320, 320);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		DefaultTableModel model = new DefaultTableModel();


		for (int i = 0; i < 20; i++) {
			model.addColumn("");
			for (int j = 0; j < 20; j++) {
				base = new JLabel();
				base.setBackground(Color.orange);
				base.setBounds(0,0,10,10);
				base.isOpaque();
				model.addRow(new Vector<>());
			}
		}
		table.setModel(model);
		//Se tienen que crear dos clases que extiendan de DefaultTableCellRenderer, una que 
		//ponga la fruta aleatoriamente en la tabla y otra que vaya alargando la serpiente
		//table.setDefaultRenderer( Object.class, new MiRender(20) );
		panel.add(table, gbc_table);

		nuevoJuego = new JButton("Nuevo Juego");
		nuevoJuego.setBounds(340, 101, 121, 23);
		frame.getContentPane().add(nuevoJuego);

		record = new JButton("R�cords");
		record.setBounds(340, 219, 121, 23);
		frame.getContentPane().add(record);

		JLabel puntuacion = new JLabel("Puntuaci�n: ");
		puntuacion.setBackground(Color.green);
		puntuacion.setBounds(340, 26, 121, 38);
		puntuacion.setFont(font);
		frame.getContentPane().add(puntuacion);
	}

	public static void draw()
	{
		panel.repaint();
	}

	public void drawSnake(Graphics g, Serpiente serp)
	{
		for(Iterator<Casilla> c = serp.getCuerpo().iterator(); c.hasNext();)
		{
			Casilla cuerpo = (Casilla)c.next();
			drawSquare(g, cuerpo, Color.GREEN);
		}
	}
	public void drawFood(Graphics g, Casilla cas)
	{
		drawCircle(g, cas, Color.RED);
	}

	public void drawSquare(Graphics g, Casilla c, Color color) //revisa
	{
		g.setColor(color);
		int size = 10; // ves probando
		g.fillRect(c.getPos().getX(), c.getPos().getY(), size-1, size-1);
	}
	public void drawCircle(Graphics g, Casilla c, Color color) //revisa
	{
		g.setColor(color);
		int size=10;
		g.fillOval(c.getPos().getX(), c.getPos().getY(), size, size);
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

	public JLabel getSerpiente() {
		return serpiente;
	}

	public void setSerpiente(JLabel serpiente) {
		this.serpiente = serpiente;
	}

	public JLabel getBase() {
		return base;
	}

	public void setBase(JLabel base) {
		this.base = base;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public void addActionListener(Controller controller) {
	}
}