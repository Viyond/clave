/*
 * Copyright 1999-2004 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.alibaba.otter.clave.common.datasource;

/**
 * @author jianghang 2011-9-2 上午11:36:21
 * @version 1.0.0
 */
public enum DataMediaType {

    /** mysql DB */
    MYSQL,
    /** oracle DB */
    ORACLE,
    /** cobar */
    COBAR,
    /** tddl */
    TDDL,
    /** cache */
    MEMCACHE,
    /** mq */
    MQ,
    /** napoli */
    NAPOLI,
    /** diamond push for us */
    DIAMOND_PUSH;

    public boolean isMysql() {
        return this.equals(DataMediaType.MYSQL);
    }

    public boolean isOracle() {
        return this.equals(DataMediaType.ORACLE);
    }

    public boolean isTddl() {
        return this.equals(DataMediaType.TDDL);
    }

    public boolean isCobar() {
        return this.equals(DataMediaType.COBAR);
    }

    public boolean isMemcache() {
        return this.equals(DataMediaType.MEMCACHE);
    }

    public boolean isMq() {
        return this.equals(DataMediaType.MQ);
    }

    public boolean isNapoli() {
        return this.equals(DataMediaType.NAPOLI);
    }

    public boolean isDiamondPush() {
        return this.equals(DataMediaType.DIAMOND_PUSH);
    }
}
