package Vista;

import java.awt.Component;
import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MiRender extends DefaultTableCellRenderer {
	private int num1, num2;
	
	public MiRender(int max) {
		num1 = (int) (Math.random() * (max - 0)) + 0;
		num2 = (int) (Math.random() * (max - 0)) + 0;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		if (row == 5 && column == 5) {
			cell.setBackground(Color.GREEN);
		}else {
			cell.setBackground(Color.WHITE);
		}
		
		if(row == num1 && column == num2) {
			cell.setBackground(Color.RED);
		}
		return cell;
		
	}
}
