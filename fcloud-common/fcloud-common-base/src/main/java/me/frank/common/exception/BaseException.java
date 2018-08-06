package me.frank.common.exception;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/6 16:08
 */
public class BaseException extends RuntimeException {
    /**
     * 异常码
     */
    protected int code;

    /**
     * 异常消息
     */
    protected String msg;


    public BaseException( int code,String msg) {
        this.msg = msg;
        this.code = code;
    }
}
