package com.github.relucent.base.util.jdbc.impl;

import com.github.relucent.base.util.jdbc.Dialect;

/**
 * JDBC查询方言mysql实现，主要用于提供分页查询<br>
 */
public class MySqlDialect extends AbstractDialect implements Dialect {

    public static final MySqlDialect INSTANCE = new MySqlDialect();

    @Override
    public String getLimitSql(String sql, int start, int limit) {
        return sql + " limit " + start + "," + limit;
    }

    @Override
    public String testQuery() {
        return "select 1";
    }
}
