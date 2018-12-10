package entity;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName PageResult
 * @Author 123456
 * @Description TODO
 * @Version 1.0
 * @Date 2018/11/25 19:11
 **/

public class PageResult implements Serializable {

    private Long total; //总记录数
    private List rows;  //当前页结果

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }
}
