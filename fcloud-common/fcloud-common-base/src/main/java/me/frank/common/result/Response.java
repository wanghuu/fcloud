package me.frank.common.result;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/6 16:14
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Response<T extends Object> implements Serializable {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    /**
     * 序列化标识
     */
    private static final long serialVersionUID = 4893280118017319089L;

    /**
     * 成功码.
     */
    public static final int SUCCESS_CODE = 200;

    /**
     * 成功信息.
     */
    public static final String SUCCESS_MESSAGE = "操作成功";

    /**
     * 错误码.
     */
    public static final int ERROR_CODE = 500;

    /**
     * 错误信息.
     */
    public static final String ERROR_MESSAGE = "内部异常";

    /**
     * 错误码：参数非法
     */
    public static final int ILLEGAL_ARGUMENT_CODE_ = 100;

    /**
     * 错误信息：参数非法
     */
    public static final String ILLEGAL_ARGUMENT_MESSAGE = "参数非法";

    /**
     * 状态码
     */
    private int code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 数据
     */
    private T  datas;

    private Response(){}

    private Response(int code,String ms,T datas){
        this.code=code;
        this.msg=msg;
        this.datas=datas;
    }

    private Response(int code,String ms){
        this.code=code;
        this.msg=msg;
        this.datas=null;
    }


    /**
     *
     * @param code 状态码
     * @param msg  信息
     * @return
     */
    public static Response build(int code,String msg){
        return new Response(code,msg);
    }

    /**
     *
     * @param code  状态码
     * @param msg   信息
     * @param datas 数据
     * @return
     */
    public static Response build(int code,String msg,Object datas){
        return new Response(code,msg);
    }

    /**
     * 成功响应
     * @param datas 响应数据
     * @return the response
     */
    public static Response ok(Object datas){
        return new Response(SUCCESS_CODE,SUCCESS_MESSAGE,datas);
    }

    /**
     * 成功响应，不包含任何数据
     * @return
     */
    public static Response ok(){
        return new Response(SUCCESS_CODE,SUCCESS_MESSAGE,null);
    }

    /**
     * 错误响应
     * @param msg 错误信息
     * @return
     */
    public static Response error(String msg){
        return new Response(ERROR_CODE,msg,null);
    }

    /**
     * 系统错误
     * @return
     */
    public static Response error(){
        return new Response(ERROR_CODE,ERROR_MESSAGE,null);
    }

}
