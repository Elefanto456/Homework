package repositories;

import entities.Expense;
import exceptions.ExpenseException;
import utilities.DBServiceMySQL;

import java.sql.*;
import java.util.ArrayList;

public class ExpenseRepo {
    public static void addExpense(Expense expense) throws ExpenseException {
        String insert = "INSERT INTO expense(what, count) VALUES (?, ?) ";
        Connection con = DBServiceMySQL.connect();

        try {
            PreparedStatement st = con.prepareStatement(insert);
            st.setString(1, expense.getWhat());
            st.setBigDecimal(2, expense.getCount());
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Expense> getAll() {
        ArrayList<Expense> list = new ArrayList<>();
        Connection con = DBServiceMySQL.connect();
        String insert = "SELECT fromWhere, count, date FROM income";
        try {
            PreparedStatement st = con.prepareStatement(insert);
            ResultSet set = st.executeQuery();
            while (set.next()) {
                list.add(new Expense (
                        set.getString(1),
                        set.getBigDecimal(2),
                        (java.util.Date) set.getObject(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<Expense> getAllTwo() {
        ArrayList<Expense> list = new ArrayList<>();
        Connection con = DBServiceMySQL.connect();
        String insert = "SELECT what, count FROM expense";
        try {
            PreparedStatement st = con.prepareStatement(insert);
            ResultSet set = st.executeQuery();
            while (set.next()) {
                list.add(new Expense (
                        set.getString(1),
                        set.getBigDecimal(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String[][] getTable(ArrayList<Expense> list) {
        String[][] data = new String[list.size()][3];
        int i = 0;
        for (Expense expense : list) {
            data[i][0] = expense.getWhat();
            data[i][1] = String.valueOf(expense.getCount());
            data[i][2] = String.valueOf(expense.getDate());

            i++;
        }
        return data;
    }
}
