package com.repair.common.mybatis.dao;

import com.repair.common.entity.TUsers;

import java.util.List;

public interface TUsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(TUsers record);

    int insertSelective(TUsers record);

    List<TUsers> selectAllUser();

    TUsers selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(TUsers record);

    int updateByPrimaryKey(TUsers record);
}