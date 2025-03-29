package vo;

import java.time.LocalDateTime;
import java.util.Date;

public class CustomerVO {

    private int custId;
    private String custName;
    private Date custBirth;
    private String custAddr;
    private String custPhone;

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public Date getCustBirth() {
        return custBirth;
    }

    public void setCustBirth(Date custBirth) {
        this.custBirth = custBirth;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public CustomerVO() {
    }

    public CustomerVO(String custAddr, Date custBirth, int custId, String custName, String custPhone) {
        this.custAddr = custAddr;
        this.custBirth = custBirth;
        this.custId = custId;
        this.custName = custName;
        this.custPhone = custPhone;
    }
}
