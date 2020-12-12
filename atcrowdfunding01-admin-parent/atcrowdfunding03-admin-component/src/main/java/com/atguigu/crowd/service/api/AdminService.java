/**
 * 
 */
package com.atguigu.crowd.service.api;

import java.util.List;

import com.atguigu.crowd.entity.Admin;

/**
 *
 * @Author: xy187 2020年12月2日 下午11:23:47
 *
 * @Desc:
 */
public interface AdminService {
    void saveAdmin(Admin admin);

    /**
     * @Author xy187 2020年12月7日 下午10:33:25
     * @return
     */
    List<Admin> getAll();

}
