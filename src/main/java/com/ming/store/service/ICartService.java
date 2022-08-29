package com.ming.store.service;

import com.ming.store.vo.CartVO;

import java.util.List;

/**
 * @author: zheming
 * @data 2022/6/8 20:39
 */
public interface ICartService {
    void addToCart(Integer uid, Integer pid, Integer amount, String username);

    List<CartVO> getVOByUid(Integer uid);

    Integer addNum(Integer cid, Integer uid, String username);

    Integer reduceNum(Integer cid, Integer uid, String username);

    List<CartVO> getVOByCids(Integer uid, Integer[] cids);
 }
