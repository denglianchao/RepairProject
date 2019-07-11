package com.repair.common.mybatis.dao;

import com.repair.common.entity.TRole;

import java.util.List;

public interface TRoleMapper {
    List<TRole> selectAllRole();

    int deleteByPrimaryKey(String roleid);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}