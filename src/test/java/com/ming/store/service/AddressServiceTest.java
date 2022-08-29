package com.ming.store.service;

import com.ming.store.entity.Address;
import com.ming.store.entity.User;
import com.ming.store.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/6 20:45
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class AddressServiceTest {

    @Autowired
    private IAddressService addressService;

    @Test
    public void addNewAddress() {
        try {
            Integer uid = 20;
            String username = "管理员";
            Address address = new Address();
            address.setName("张三");
            address.setPhone("17858805555");
            address.setAddress("雁塔区小寨华旗");
            addressService.addNewAddress(uid, username, address);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getByUid() {
        Integer uid = 7;
        List<Address> list = addressService.getByUid(uid);
        System.out.println("count=" + list.size());
        for (Address item : list) {
            System.out.println(item);
        }
    }
    @Test
    public void setDefault() {
        try {
            Integer aid = 4;
            Integer uid = 7;
            String username = "系统管理员";
            addressService.setDefault(aid, uid, username);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void delete() {
            addressService.delete(2, 20, "管理员");
            System.out.println("OK.");
    }
}
