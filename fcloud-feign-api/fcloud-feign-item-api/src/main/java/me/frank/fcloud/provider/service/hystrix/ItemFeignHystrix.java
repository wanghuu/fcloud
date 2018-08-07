package me.frank.fcloud.provider.service.hystrix;

import me.frank.common.result.FCloudResponse;
import me.frank.fcloud.provider.service.ItemFeignApi;
import org.springframework.stereotype.Component;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/7 11:43
 */
@Component
public class ItemFeignHystrix implements ItemFeignApi {


    @Override
    public FCloudResponse getItemList() {
        return null;
    }

    @Override
    public FCloudResponse getItemDetial(String id) {
        return null;
    }
}
