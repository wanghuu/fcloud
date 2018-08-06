package me.frank.common.exception;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/6 16:39
 */
public class BusinessException extends BaseException {

    public BusinessException(int code,String msg) {
        super(code,msg);
    }
}
