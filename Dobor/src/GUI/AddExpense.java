package GUI;

import entities.Expense;
import exceptions.ExpenseException;
import repositories.ExpenseRepo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class AddExpense {

    private JFrame mainFrame;
    private JPanel mainPanel;
    private JLabel nameL;
    private JLabel countL;
    private JTextField nameTF;
    private JTextField countTF;
    private JButton addIncome;

    public AddExpense() {
        mainFrame = new JFrame("Add expense");
        mainFrame.setBounds(100, 100, 200, 200);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new GridLayout(3, 2));

        nameL = new JLabel("name");
        nameTF = new JTextField();
        mainPanel.add(nameL);
        mainPanel.add(nameTF);

        countL = new JLabel("count");
        countTF = new JTextField();
        mainPanel.add(countL);
        mainPanel.add(countTF);

        addIncome = new JButton("Add");
        addIncome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String addName = nameTF.getText();
                String addCount = countTF.getText();
                double addCount1 = Double.parseDouble(addCount);
                BigDecimal newCount =  BigDecimal.valueOf(addCount1);
                try {
                    Expense expense = new Expense(addName, newCount);
                    ExpenseRepo.addExpense(expense);
                    new FormForClient();
                    mainFrame.dispose();
                } catch (ExpenseException e1) {
                    e1.printStackTrace();
                }
            }
        });

        mainPanel.add(addIncome);
        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
    }

}
