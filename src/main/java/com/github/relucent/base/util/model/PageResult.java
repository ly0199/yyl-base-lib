package com.github.relucent.base.util.model;

import java.util.List;

import com.github.relucent.base.util.page.Page;
import com.github.relucent.base.util.page.Pagination;

/**
 * 返回结果对象(分页数据)
 * @param <T> 列表元素数据类型泛型
 */
@SuppressWarnings("serial")
public class PageResult<T> extends Result<List<T>> {

    // ==============================Fields========================================
    /** 开始查询 的数据索引号 (从0开始) */
    private int offset = 0;
    /** 每页条数 */
    private int limit = Pagination.DEFAULT_LIMIT;
    /** 总记录数 */
    private long total = 0;

    // ==============================Constructors==================================
    /**
     * 构造函数
     * @param offset 记录开始索引号
     * @param limit 页面最大记录数
     * @param data 当前页数据
     * @param total 总记录数
     */
    protected PageResult(int offset, int limit, List<T> data, long total) {
        super("OK", data);
        this.offset = offset;
        this.limit = limit;
        this.total = total;
    }

    /**
     * 创建分页结果对象
     * @param <T> 列表元素数据类型泛型
     * @param page 分页查询的结果数据 
     * @return 分页结果对象
     */
    public static <T> PageResult<T> of(Page<T> page) {
        return new PageResult<>(page.getOffset(), page.getLimit(), page.getRecords(), page.getTotal());
    }

    // ========================================Methods========================================
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
