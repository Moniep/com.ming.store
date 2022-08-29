package com.ming.store.mapper;

import com.ming.store.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/8 11:38
 */
public interface AddressMapper {


    Integer insert(Address address);

    Integer countByUid(Integer uid);

    List<Address> findByUid(Integer uid);

    Integer updateNonDefaultByUid(Integer uid);

    Integer updateDefaultByAid(
            @Param("aid") Integer aid,
            @Param("modifiedUser") String modifiedUser,
            @Param("modifiedTime") Date modifiedTime);

    Address findByAid(Integer aid);

    Integer deleteByAid(Integer aid);

    Address findLastModified(Integer uid);
}
