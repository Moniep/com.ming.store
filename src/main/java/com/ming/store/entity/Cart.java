package com.ming.store.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author: zheming
 * @data 2022/6/8 20:35
 */
public class Cart extends BaseEntity implements Serializable {
    private Integer cid;
    private Integer uid;
    private Integer pid;
    private Long price;
    private Integer num;

    public Cart() {
    }

    public Cart(Integer cid, Integer uid, Integer pid, Long price, Integer num) {
        this.cid = cid;
        this.uid = uid;
        this.pid = pid;
        this.price = price;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        if (!super.equals(o)) return false;
        Cart cart = (Cart) o;
        return Objects.equals(getCid(), cart.getCid()) && Objects.equals(getUid(), cart.getUid()) && Objects.equals(getPid(), cart.getPid()) && Objects.equals(getPrice(), cart.getPrice()) && Objects.equals(getNum(), cart.getNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCid(), getUid(), getPid(), getPrice(), getNum());
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
