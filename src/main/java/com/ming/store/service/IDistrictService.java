package com.ming.store.service;

import com.ming.store.entity.District;

import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/8 12:31
 */
public interface IDistrictService {
    List<District> getByParent(String parent);

    String getNameByCode(String code);
}
