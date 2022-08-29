package com.ming.store.service.impl;

import com.ming.store.entity.Address;
import com.ming.store.entity.District;
import com.ming.store.mapper.AddressMapper;
import com.ming.store.mapper.DistrictMapper;
import com.ming.store.service.IAddressService;
import com.ming.store.service.IDistrictService;
import com.ming.store.service.ex.AddressCountLimitException;
import com.ming.store.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/8 11:59
 */

@Service
public class DistrictServiceImpl implements IDistrictService {

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<District> getByParent(String parent) {
        List<District> list = districtMapper.findByParent(parent);
        for (District district : list) {
            district.setId(null);
            district.setParent(null);
        }
        return list;
    }

    @Override
    public String getNameByCode(String code) {
        return districtMapper.findNameByCode(code);
    }
}
