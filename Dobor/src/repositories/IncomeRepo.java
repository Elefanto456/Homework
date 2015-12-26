package repositories;

import entities.Income;
import exceptions.IncomeException;
import utilities.DBServiceMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IncomeRepo {

    public static void addIncome(Income income) throws IncomeException {
        String insert = "INSERT INTO income(fromWhere, count) VALUES (?, ?) ";
        Connection con = DBServiceMySQL.connect();

        try {
            PreparedStatement st = con.prepareStatement(insert);
            st.setString(1, income.getFromWhere());
            st.setBigDecimal(2, income.getCount());
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Income> getAll() {
        ArrayList<Income> list = new ArrayList<>();
        Connection con = DBServiceMySQL.connect();
        String insert = "SELECT fromWhere, count, date FROM income";
        try {
            PreparedStatement st = con.prepareStatement(insert);
            ResultSet set = st.executeQuery();
            while (set.next()) {
                list.add(new Income (
                        set.getString(1),
                        set.getBigDecimal(2),
                        (java.util.Date) set.getObject(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<Income> getAllTwo() {
        ArrayList<Income> list = new ArrayList<>();
        Connection con = DBServiceMySQL.connect();
        String insert = "SELECT fromWhere, count FROM income";
        try {
            PreparedStatement st = con.prepareStatement(insert);
            ResultSet set = st.executeQuery();
            while (set.next()) {
                list.add(new Income (
                        set.getString(1),
                        set.getBigDecimal(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String[][] getTable(ArrayList<Income> list) {
        String[][] data = new String[list.size()][3];
        int i = 0;
        for (Income income : list) {
            data[i][0] = income.getFromWhere();
            data[i][1] = String.valueOf(income.getCount());
            data[i][2] = String.valueOf(income.getDate());

            i++;
        }
        return data;
    }

    public static String getCount() {
        String s = new String();
        String s2 = new String();
        String s3 = new String();
        String insert = "SELECT sum(count) FROM income";
        String insert2 = "SELECT sum(count) FROM expense";
        Connection con = DBServiceMySQL.connect();
        try {
            PreparedStatement st = con.prepareStatement(insert);
            ResultSet set = st.executeQuery();
            PreparedStatement st2 = con.prepareStatement(insert2);
            ResultSet set2 = st2.executeQuery();

            while (set.next()) {
                while (set2.next()) {
                    s2 = String.valueOf(set2.getBigDecimal(1));
                    double d2 = Double.parseDouble(s2);
                    s = String.valueOf(set.getBigDecimal(1));
                    double d = Double.parseDouble(s);
                    double d3 = d - d2;
                    s3 = String.valueOf(d3);
                }

            }
            return s3;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

}
