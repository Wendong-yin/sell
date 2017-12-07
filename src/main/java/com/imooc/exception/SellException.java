package com.imooc.exception;

import com.imooc.enums.ResultEnum;

public class SellException extends RuntimeException{

    private Integer code;

    // 自己定义Exception的异常

    public SellException(ResultEnum resultEnum) {
        // 把我们自己定义的message传到父类的构造方法中
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
