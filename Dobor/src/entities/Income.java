package entities;

import java.math.BigDecimal;
import java.util.Date;

public class Income {
    private int id;
    private String fromWhere;
    private BigDecimal count;
    private Date date;

    public Income(String fromWhere, BigDecimal count, Date date) {
        this.fromWhere = fromWhere;
        this.count = count;
        this.date = date;
    }

    public Income(String fromWhere, BigDecimal count) {
        this.fromWhere = fromWhere;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
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

    public void setCount(BigDecimal count) {
        this.count = count;
    }
}
