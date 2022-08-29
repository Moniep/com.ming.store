package com.ming.store.controller.ex;

import com.ming.store.service.ex.ServiceException;

/**
 * @author: zheming
 * @data 2022/6/8 22:14
 */
public class CartNotFoundException extends ServiceException {
    public CartNotFoundException() {
        super();
    }

    public CartNotFoundException(String message) {
        super(message);
    }

    public CartNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CartNotFoundException(Throwable cause) {
        super(cause);
    }

    protected CartNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
