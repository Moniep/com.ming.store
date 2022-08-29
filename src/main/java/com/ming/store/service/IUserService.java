package com.ming.store.service;

import com.ming.store.entity.User;

/**
 * @author: zheming
 * @data 2022/6/6 21:58
 */
public interface IUserService {
    void reg(User user);

    User login(String username,String password);

    void changePassword(Integer uid,String username,String oldPassword,String newPassword);

    User getByUid(Integer uid);

    void changeInfo(Integer uid,String username,User user);

    void changeAvatar(Integer uid, String username, String avatar);
}
