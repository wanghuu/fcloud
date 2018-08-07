package me.frank.fcloud.provider.service.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/7 13:28
 */
@Data
public class Item {

    /**
     * 商品id
     */
    Integer id;


    /**
     * 商品名
     */
    String name;

    /**
     * 商品图片url
     */
    String imageUrl;

    /**
     * 创建时间
     */
    Date createTime;

    /**
     * 更新时间
     */
    Date updateTime;
}
