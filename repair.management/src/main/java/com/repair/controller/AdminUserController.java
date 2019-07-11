package com.repair.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.repair.common.entity.TRole;
import com.repair.controller.result.ResultData;
import com.repair.service.AUserService;
import com.repair.common.entity.TUsers;
import com.repair.untils.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by lianchao.deng on 2017/7/23.
 */
@Controller
@RequestMapping("/adminuser")
public class AdminUserController{

    private static final Logger logger = LoggerFactory.getLogger(AdminUserController.class);

    @Autowired
    private AUserService aUserService;

    @RequestMapping("/userinfo")
    @ResponseBody
    public ResultData showAdminUser(HttpServletRequest request, HttpServletResponse response){
        ResultData resultDate = new ResultData();
        try {
            PageHelper.startPage(3, 5);
            List<TUsers> users = aUserService.getUsers();
            PageInfo<TUsers> pi = new PageInfo<TUsers>(users);
            if(users == null){
                resultDate.setCode(201);
                resultDate.setMsg("查询失败");
                return resultDate;
            }
            Map<String,Object> data = new HashMap<String,Object>();
            data.put("users",users);
            resultDate.setResult(data);
            resultDate.setCode(200);
            resultDate.setMsg("查询成功");
            System.out.println("查询成功了");
        } catch (Exception e) {
            e.printStackTrace();
            resultDate.setCode(201);
            resultDate.setMsg("查询异常" + e.getMessage());
        }
        return resultDate;
    }

    @RequestMapping("/role-info")
    @ResponseBody
    public ResultData showRoleInfo(@RequestParam Integer pageNum, @RequestParam Integer pageSize, HttpServletRequest request, HttpServletResponse response){
        ResultData resultData = new ResultData();
        try {
            if(StringUtils.isEmpty(pageNum)){
                pageNum = 1;
            }

            if(StringUtils.isEmpty(pageSize)){
                pageSize = 10;
            }

            PageHelper.startPage(pageNum, pageSize);
            List<TRole> roles = aUserService.getRoleList();
            PageInfo<TRole> page = new PageInfo<TRole>(roles);
            if(page == null){
                resultData.setCode(ResultData.Code.FAIL);
                resultData.setMsg("查询失败");
                return resultData;
            }
            Map<String,Object> data = new HashMap<String,Object>();
            data.put("page",page);
            resultData.setResult(data);
            resultData.setCode(ResultData.Code.SUCCESS);
            resultData.setMsg("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultData.setCode(ResultData.Code.EXCEPTION);
            resultData.setMsg("查询异常" + e.getMessage());
        }
        return resultData;
    }

    @RequestMapping("/role-delete")
    @ResponseBody
    public ResultData deleteRoleInfo(@RequestParam String roleid, HttpServletRequest request, HttpServletResponse response){
        ResultData resultData = new ResultData();
        try {
            if(StringUtils.isEmpty(roleid)) {
                resultData.setCode(ResultData.Code.FAIL);
                resultData.setMsg("删除角色对象不能为空");
                return resultData;
            }
            TRole role = aUserService.getRoleById(roleid);
            if(role != null) {
                aUserService.deleteRoleById(roleid);
            }
            resultData.setCode(ResultData.Code.SUCCESS);
            resultData.setMsg("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultData.setCode(ResultData.Code.EXCEPTION);
            resultData.setMsg("删除异常" + e.getMessage());
        }
        return resultData;
    }

    @RequestMapping("/role-update")
    @ResponseBody
    public ResultData updateRoleInfo(@ModelAttribute TRole role, HttpServletRequest request, HttpServletResponse response){
        ResultData resultData = new ResultData();
        try {
            if(role == null || StringUtils.isEmpty(role.getRoleid())) {
                resultData.setCode(ResultData.Code.FAIL);
                resultData.setMsg("更新对象不能为空");
                return resultData;
            }
            TRole tRole = aUserService.getRoleById(role.getRoleid());
            if(tRole != null) {
                tRole.setUpdatetime(DateUtil.getStringNowDate());
                tRole.setRoledesc(role.getRoledesc());
                tRole.setRoledesc(role.getRolename());
                aUserService.updateRole(tRole);
                resultData.setCode(ResultData.Code.SUCCESS);
                resultData.setMsg("更新成功");
            } else {
                resultData.setCode(ResultData.Code.FAIL);
                resultData.setMsg("未查询到更新对象");
                return resultData;
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultData.setCode(ResultData.Code.EXCEPTION);
            resultData.setMsg("更新异常" + e.getMessage());
        }
        return resultData;
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String helloUser(){
        return "hello!kevins";
    }

}
