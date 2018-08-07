package me.frank.fcloud.provider.repository;

import com.google.common.collect.Lists;
import me.frank.fcloud.provider.service.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/7 13:34
 */
@Repository
public class ItemRepository {

    public List<Item> getItemList() {
        List<Item> itemList = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            Item item = new Item();
            item.setId(i+1);
            item.setImageUrl("http://wwww.image.com?id="+i);
            item.setName("商品"+(i+1)+"号");
            item.setCreateTime(new Date());
            item.setUpdateTime(new Date());
            itemList.add(item);
        }

        return itemList;
    }
}
