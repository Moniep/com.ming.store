package com.ming.store.service;

import com.ming.store.entity.Address;

import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/8 11:57
 */
public interface IAddressService {
    void addNewAddress(Integer uid, String username, Address address);

    void setDefault(Integer aid, Integer uid, String username);

    List<Address> getByUid(Integer uid);

    void delete(Integer aid, Integer uid, String username);

    Address getByAid(Integer aid, Integer uid);
}
