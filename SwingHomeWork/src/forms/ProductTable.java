package forms;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ProductTable extends JFrame{
    public static void main(String[] args) {

        JFrame f = new JFrame("First");
        JPanel panel = new JPanel(new GridLayout(1,1));

        String[] columns = {"name", "price", "weight", "manufacturer", "category"};
        String[][] data = {
                {"First", "150", "5", "Russia", "abc"},
                {"Second", "150", "5", "Russia", "abcd"}
        };

        JTable table = new JTable(data, columns);

        table.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(scrollPane);
        panel.setBorder(new TitledBorder("Products list"));

        f.add(panel);
        f.setResizable(false);
        f.setPreferredSize(new Dimension(400, 500));
        f.setSize(500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true);

    }

}

