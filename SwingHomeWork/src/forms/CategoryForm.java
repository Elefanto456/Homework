package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoryForm extends JFrame{
    public static void main(String[] args) {
        JFrame f = new JFrame("First");
        JPanel panel = new JPanel();

        JLabel name = new JLabel("name",JLabel.LEFT);
        JTextField fName = new JTextField("", 40);

        panel.add(name);
        panel.add(fName);

        JLabel parent = new JLabel("parent",JLabel.LEFT);
        String[] names = {"abc", "abcd", "abcde"};
        JComboBox parentBox = new JComboBox(names);
        parentBox.setSelectedIndex(1);
        parentBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox combo = (JComboBox) e.getSource();
                String currentQuantity1 = (String) combo.getSelectedItem();
            }
        });

        panel.add(parent);
        panel.add(parentBox);

        JButton add = new JButton("Add");

        panel.add(add);

        f.add(panel);
        f.setResizable(false);
        f.setPreferredSize(new Dimension(400, 500));
        f.setSize(500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
    }
}
