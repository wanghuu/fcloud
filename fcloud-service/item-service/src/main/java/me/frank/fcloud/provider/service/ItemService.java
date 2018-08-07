package me.frank.fcloud.provider.service;

import me.frank.fcloud.provider.service.entity.Item;
import me.frank.fcloud.provider.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/7 13:25
 */
@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getItemList(){
        return itemRepository.getItemList();
    }
}
