package com.repair.service.impl;

import com.repair.common.entity.TRole;
import com.repair.common.mybatis.dao.TRoleMapper;
import com.repair.service.AUserService;
import com.repair.common.entity.TUsers;
import com.repair.common.mybatis.dao.TUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lianchao.deng on 2017/7/22.
 */
@Service("aUserService")
public class AUserServiceImpl implements AUserService {

    @Autowired
    private TUsersMapper usersMapper;

    @Autowired
    private TRoleMapper roleMapper;

    public List<TRole> getRoleList() {
        return roleMapper.selectAllRole();
    }

    public void deleteRoleById(String roleid) {
        roleMapper.deleteByPrimaryKey(roleid);
    }

    public TRole getRoleById(String roleid) {
        return roleMapper.selectByPrimaryKey(roleid);
    }

    public int updateRole(TRole role) {
        return roleMapper.updateByPrimaryKey(role);
    }

    public List<TUsers> getUsers() {
        List<TUsers> users = usersMapper.selectAllUser();
        return users;
    }

    public TUsers getUser(){
        TUsers user = usersMapper.selectByPrimaryKey(1);
        return user;
    }
}
