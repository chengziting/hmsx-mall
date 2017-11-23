package com.hmsx.mall.dao;

import com.hmsx.mall.model.persistent.BaseModel;

import java.util.List;

/**
 * Created by user on 2017-10-19.
 */
public interface IBaseDao<TEntity extends BaseModel,TId> {
    TEntity get(TId id);
    List<TEntity> list(int startIndex,int count);
}
