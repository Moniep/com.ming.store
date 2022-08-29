package com.ming.store.mapper;

import com.ming.store.entity.District;

import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/8 12:25
 */
public interface DistrictMapper {

    List<District> findByParent(String parent);

    String findNameByCode(String code);


}
