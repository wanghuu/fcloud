package me.frank.fcloud.provider.web.rpc;

import me.frank.common.result.FCloudResponse;
import me.frank.fcloud.provider.service.ItemFeignApi;
import me.frank.fcloud.provider.service.ItemService;
import me.frank.fcloud.provider.service.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/7 13:24
 */
@RestController
public class ItemFeignClient implements ItemFeignApi {
    @Autowired
    private ItemService itemService;

    @Override
    public FCloudResponse<List<Item>> getItemList() {
        return FCloudResponse.ok(itemService.getItemList());
    }

    @Override
    public FCloudResponse<Item> getItemDetial(String id) {
        Item item = new Item();
        item.setId(Integer.valueOf(id));
        item.setName("test");
        item.setImageUrl("dkaljf;ldsaf");
        item.setCreateTime(new Date());
        item.setUpdateTime(new Date());
        return FCloudResponse.ok(item);
    }
}
