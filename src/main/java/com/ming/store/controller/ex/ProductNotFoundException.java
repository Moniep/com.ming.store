package com.ming.store.controller.ex;

/**
 * @author: zheming
 * @data 2022/6/8 20:16
 */
public class ProductNotFoundException extends SecurityException{
    public ProductNotFoundException() {
        super();
    }

    public ProductNotFoundException(String s) {
        super(s);
    }

    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductNotFoundException(Throwable cause) {
        super(cause);
    }
}
