package MDM;

import java.math.BigInteger;
import java.util.Date;

public class Custom {

    private Date date;
    private BigInteger integer;

    public Custom(Date date, BigInteger integer) {
        this.date = date;
        this.integer = integer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigInteger getInteger() {
        return integer;
    }

    public void setInteger(BigInteger integer) {
        this.integer = integer;
    }
}
