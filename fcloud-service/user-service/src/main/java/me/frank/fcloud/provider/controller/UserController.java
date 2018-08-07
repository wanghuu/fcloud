package me.frank.fcloud.provider.controller;

import com.google.common.collect.Maps;
import me.frank.common.result.FCloudResponse;
import me.frank.fcloud.provider.service.ItemFeignApi;
import me.frank.fcloud.provider.service.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/7 13:51
 */
@RestController
public class UserController {
    @Autowired
    private ItemFeignApi itemFeignApi;

    @GetMapping("/users/item")
    public FCloudResponse getUsers(){
        FCloudResponse<List<Item>> itemList = itemFeignApi.getItemList();
        List<Item> datas = itemList.getDatas();
        Map<String,Object> result= Maps.newHashMap();
        result.put("items",datas);
        result.put("info","这是从商品服务获取的数据！");
        return FCloudResponse.ok(result);
    }
}
