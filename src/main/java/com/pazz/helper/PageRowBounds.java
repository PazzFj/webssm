package com.pazz.helper;


import org.apache.ibatis.session.RowBounds;

/**
 * @author liuzenghui
 */
public class PageRowBounds extends RowBounds {
    private Long total;
    private Boolean count;

    public PageRowBounds(int offset, int limit) {
        super(offset, limit);
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Boolean getCount() {
        return count;
    }

    public void setCount(Boolean count) {
        this.count = count;
    }
}