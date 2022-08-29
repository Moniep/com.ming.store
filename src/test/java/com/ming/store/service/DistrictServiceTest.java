package com.ming.store.service;

import com.ming.store.entity.Address;
import com.ming.store.entity.District;
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
public class DistrictServiceTest {
    @Autowired
    private IDistrictService districtService;

    @Test
    public void getByParent() {
        try {
            String parent = "86";
            List<District> list = districtService.getByParent(parent);
            System.out.println("count=" + list.size());
            for (District item : list) {
                System.out.println(item);
            }
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
