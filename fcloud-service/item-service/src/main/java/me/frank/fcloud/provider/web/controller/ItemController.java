package me.frank.fcloud.provider.web.controller;

import me.frank.common.result.FCloudResponse;
import me.frank.fcloud.provider.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/7 13:22
 */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public FCloudResponse getItemList(){
        return FCloudResponse.ok(itemService.getItemList());
    }
}
