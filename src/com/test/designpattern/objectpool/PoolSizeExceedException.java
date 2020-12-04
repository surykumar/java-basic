package com.test.designpattern.objectpool;

public class PoolSizeExceedException extends RuntimeException {
    PoolSizeExceedException(int size) {
        super("Pool size exceed from maximum allowed pool size " + size);
    }
}
