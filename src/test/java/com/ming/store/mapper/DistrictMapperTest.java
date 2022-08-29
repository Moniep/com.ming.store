package com.ming.store.mapper;

import com.ming.store.entity.District;
import com.ming.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/6 20:45
 */
//表示标注当前的类是一个测试类，不会随同项目一块打包
@SpringBootTest
//@RunWith:表示启动当前这个单元测试类（单元测试类是不能够运行的），需要传递一个参数，必须是SpringRunner的实例类型
@RunWith(SpringRunner.class)
public class DistrictMapperTest {
    @Autowired
    private DistrictMapper districtMapper;

    @Test
    public void findByParent() {
        String parent = "110100";
        List<District> list = districtMapper.findByParent(parent);
        System.out.println("count=" + list.size());
        for (District district : list) {
            System.out.println(district);
        }
    }

    @Test
    public void findNameByCode() {
        String code = "540000";
        String name = districtMapper.findNameByCode(code);
        System.out.println(name);
    }
}
