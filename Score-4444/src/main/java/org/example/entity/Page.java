package org.example.entity;

/**
 * @author wsd_02
 */
public class Page {
public Integer currentPage;
public Integer pageSize;

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

