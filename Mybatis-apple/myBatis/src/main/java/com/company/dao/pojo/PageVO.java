package com.company.dao.pojo;

public class PageVO {
    private int page;
    private int size;

    @Override
    public String toString() {
        return "PageVO{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PageVO(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public PageVO() {
    }
}
