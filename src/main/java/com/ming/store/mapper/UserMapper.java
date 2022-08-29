package com.ming.store.mapper;

/**
 * @author: zheming
 * @data 2022/6/6 19:28
 */

import com.ming.store.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/** 用户模块的持久层接口*/

public interface UserMapper {
    /**
     * 插入用户的数据
     * @param user 用户的数据
     * @return 受影响的行数(增、删、改都受影响的行数作为返回值，可以根据返回值来判断是否执行成功)
     * */
   Integer insert(User user);

   /**
    * 根据用户名来查询用户的数据
    * @param username 用户名
    * @return  如果找到对应的用户则返回这个用户的数据，如果没有找到则返回null值
    * */

   User findByUsername(String username);

   Integer updatePasswordByUid(
           @Param("uid") Integer uid,
           @Param("password") String password,
           @Param("modifiedUser") String modifiedUser,
           @Param("modifiedTime") Date modifiedTime);

   User findByUid(Integer uid);

   Integer updateInfoByUid(User user);

   Integer updateAvatarByUid(
           @Param("uid") Integer uid,
           @Param("avatar") String avatar,
           @Param("modifiedUser") String modifiedUser,
           @Param("modifiedTime") Date modifiedTime);
}
