package me.frank.common.exception;

import org.springframework.http.HttpStatus;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/6 16:40
 */
public class BadRequestException extends BaseException {

    public BadRequestException(String msg) {
        super(HttpStatus.BAD_REQUEST.value(),msg);
    }
}
