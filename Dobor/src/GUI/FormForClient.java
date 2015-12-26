package GUI;

import entities.Expense;
import entities.Income;
import repositories.ExpenseRepo;
import repositories.IncomeRepo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormForClient extends JFrame{
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JPanel labelPanel;
    private JPanel labelPanel2;
    private JPanel tablePanel;
    private JPanel buttonPanel;
    private JLabel title;
    private JLabel userName;
    private JLabel userCount;
    private JLabel incomeL;
    private JLabel expenseL;
    private JScrollPane incomeSP;
    private JScrollPane expenseSP;
    private JTable income;
    private JTable expense;
    private JButton addIncome;
    private JButton addExpense;

    public FormForClient() {
        mainFrame = new JFrame("Count");
        mainFrame.setBounds(30, 30, 950, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());
        //mainPanel = new JPanel(new BorderLayout());

        labelPanel = new JPanel(new GridLayout(2,2));

        tablePanel = new JPanel(new FlowLayout());

        buttonPanel = new JPanel(new FlowLayout());

        title = new JLabel("Hello");
        String s = IncomeRepo.getCount();
        userCount = new JLabel("Your count: " + s);
        incomeL = new JLabel("Income");
        expenseL = new JLabel("Expense");
        labelPanel.add(title);
        labelPanel.add(userCount);
        labelPanel.add(incomeL);
        labelPanel.add(expenseL);

        //INCOME
        String[] labels = {"Name", "Count"};
        ArrayList<Income> listOfIncome = IncomeRepo.getAllTwo();
        String[][] rowsIncome = IncomeRepo.getTable(listOfIncome);

        income = new JTable( rowsIncome, labels );
        income.setEnabled(false);

        incomeSP = new JScrollPane(income);

        addIncome = new JButton("Add");
        addIncome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
                new AddIncome();
            }
        });

        //EXPENSE
        String[] labels2 = {"Name", "Count"};
        ArrayList<Expense> listOfExpense = ExpenseRepo.getAllTwo();
        String[][] rowsExpense = ExpenseRepo.getTable(listOfExpense);

        expense = new JTable( rowsExpense, labels2 );
        expense.setEnabled(false);

        expenseSP = new JScrollPane(expense);

        addExpense = new JButton("Add");
        addExpense.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
                new AddExpense();
            }
        });


        tablePanel.add(incomeSP);
        tablePanel.add(expenseSP);

        buttonPanel.add(addIncome);
        buttonPanel.add(addExpense);

        mainFrame.add(labelPanel, BorderLayout.NORTH);
        mainFrame.add(tablePanel, BorderLayout.CENTER);
        mainFrame.add(buttonPanel, BorderLayout.SOUTH);
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new FormForClient();
    }
}
