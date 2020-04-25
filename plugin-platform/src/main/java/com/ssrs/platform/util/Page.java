package com.ssrs.platform.util;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 分页工具
 * @Author: ssrs
 * @CreateDate: 2019/9/22 11:43
 * @UpdateUser: ssrs
 * @UpdateDate: 2019/9/22 11:43
 * @Version: 1.0
 */
public class Page implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 每页记录数
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 当前页数
     */
    private int pageIndex;
    /**
     * 列表数据
     */
    private List<?> data;

    /**
     * 分页
     *
     * @param data       列表数据
     * @param totalCount 总记录数
     * @param pageSize   每页记录数
     * @param pageIndex   当前页数
     */
    public Page(List<?> data, int totalCount, int pageSize, int pageIndex) {
        this.data = data;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.totalPage = (int) Math.ceil((double) totalCount / pageSize);
    }

    /**
     * 分页
     */
    public Page(IPage<?> page) {
        this.data = page.getRecords();
        this.totalCount = (int) page.getTotal();
        this.pageSize = (int) page.getSize();
        this.pageIndex = (int) page.getCurrent();
        this.totalPage = (int) page.getPages();
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public List<?> getDate() {
        return data;
    }

    public void setDate(List<?> data) {
        this.data = data;
    }
}

