package com.lx.springboot.service;

import com.lx.springboot.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zhuwenbin
 * @since 2019-02-21
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    SysUser getSysUserByUsername(String username);
}
