package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductForm extends JFrame{
    public static void main(String[] args) {

        JFrame f = new JFrame("First");
        JPanel productContent = new JPanel();

       /* JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true); //???*/

        JLabel lname = new JLabel("Name", JLabel.CENTER);
        final JTextField name = new JTextField("", 40);

        JLabel lprice = new JLabel("Price", JLabel.CENTER);
        final JTextField price = new JTextField("", 40);

        JLabel lwight = new JLabel("Wight", JLabel.CENTER);
        final JTextField wight = new JTextField("", 15);

        JLabel lmanufacturer = new JLabel("Manufacturer");
        String[] manufacturer = {"Russia", "USA"};
        JComboBox manufacturerList = new JComboBox(manufacturer);
        manufacturerList.setSelectedIndex(1);
        manufacturerList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox combo = (JComboBox) e.getSource();
                String currentQuantity = (String) combo.getSelectedItem();
            }
        });

        JLabel lcategory = new JLabel("Category", JLabel.CENTER);
        String[] names = {"abc", "abcd", "abcde"};
        JComboBox categoryBox = new JComboBox(names);
        categoryBox.setSelectedIndex(1);
        categoryBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox combo = (JComboBox) e.getSource();
                String currentQuantity1 = (String) combo.getSelectedItem();
            }
        });

        /*String[] columns = {"name", "price", "wight", "manufacturer", "category"};
        Object[][] data = {"First", "150", "5", "Russia", "abc"},{"Second", "150", "5", "Russia", "abcd"};*/
        JButton add = new JButton("Add");

        productContent.add(lname);
        productContent.add(name);
        productContent.add(lprice);
        productContent.add(price);
        productContent.add(lwight);
        productContent.add(wight);
        productContent.add(lmanufacturer);
        productContent.add(manufacturerList);
        productContent.add(lcategory);
        productContent.add(categoryBox);
        productContent.add(add);

        f.add(productContent);
        f.setResizable(false);
        f.setPreferredSize(new Dimension(400, 500));
        f.setSize(500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true);

    }
}