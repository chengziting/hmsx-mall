package com.hmsx.mall.model.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;

import java.io.Serializable;

/**
 * Created by user on 2017-10-17.
 */
public class GUIDGenerator extends org.hibernate.id.GUIDGenerator  {
    public static final String GENERATOR_NAME = "com.hmsx.mall.model.utils.GUIDGenerator";
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
        String result = (String)super.generate(session, obj);
        return hexToStr(result);
    }

    private String hexToStr(String guid) {
        return guid.replaceAll("(.{8})(.{4})(.{4})(.{4})(.{12})", "$1-$2-$3-$4-$5").replaceAll("(.{2})(.{2})(.{2})(.{2}).(.{2})(.{2}).(.{2})(.{2})(.{18})", "$4$3$2$1-$6$5-$8$7$9");
    }
}
