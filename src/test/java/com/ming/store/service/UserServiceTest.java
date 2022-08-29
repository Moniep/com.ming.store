package com.ming.store.service;

import com.ming.store.entity.User;
import com.ming.store.mapper.UserMapper;
import com.ming.store.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: zheming
 * @data 2022/6/6 20:45
 */
//表示标注当前的类是一个测试类，不会随同项目一块打包
@SpringBootTest
//@RunWith:表示启动当前这个单元测试类（单元测试类是不能够运行的），需要传递一个参数，必须是SpringRunner的实例类型
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void reg(){
        try {
            User user = new User();
            user.setUsername("21");
            user.setPassword("123");
            userService.reg(user);
            System.out.println("OK");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void login(){
        User user = userService.login("Mike","123");
        System.out.println(user);
    }

    @Test
    public void changePassword(){
        userService.changePassword(7,"21","123","321");
    }

    @Test
    public void getByUid(){
        System.err.println(userService.getByUid(7));
    }

    @Test
    public void chanegeInfo(){
        User user =new User();
        user.setPhone("12342344235");
        user.setEmail("yuan@qq.com");
        user.setGender(0);
        userService.changeInfo(7,"管理员",user);
    }

    @Test
    public void changeAvatar() {
        try {
            Integer uid = 3;
            String username = "头像管理员";
            String avatar = "/upload/avatar.png";
            userService.changeAvatar(uid, username, avatar);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
