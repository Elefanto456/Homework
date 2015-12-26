package entities;

import java.math.BigDecimal;
import java.util.Date;

public class Expense {
    private int id;
    private String what;
    private BigDecimal count;
    private Date date;

    public Expense (String what, BigDecimal count, Date date) {
        this.what = what;
        this.count = count;
        this.date = date;
    }

    public Expense (String what, BigDecimal count) {
        this.what = what;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getCount() {
        return count;
    }
}
