package com.repair.service;

import com.repair.common.entity.TRole;
import com.repair.common.entity.TUsers;

import java.util.List;

/**
 * Created by lenovo on 2017/7/22.
 */
public interface AUserService {
     List<TRole> getRoleList();

     void deleteRoleById(String roleid);

     TRole getRoleById(String roleid);

     int updateRole(TRole role);

     List<TUsers> getUsers();

     TUsers getUser();

}
