package me.frank.fcloud.provider.service;

import me.frank.common.result.FCloudResponse;
import me.frank.fcloud.provider.service.entity.Item;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/7 11:43
 */
@FeignClient(value = "item-service")
public interface ItemFeignApi {

    @GetMapping("api/items")
    FCloudResponse<List<Item>> getItemList();

    @GetMapping("api/items/{id}")
    FCloudResponse<Item> getItemDetial(@PathVariable("id") String id);
}
