package study.wyy.dubbo.springboot.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import study.wyy.dubbo.api.bean.UserAddress;
import study.wyy.dubbo.api.service.OrderService;
import study.wyy.dubbo.api.service.UserService;

import java.util.List;

/**
 * @author ：wyaoyao
 * @date ： 2020-05-11 20:57
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Reference
    private UserService userService;


    @Override
    public void initOrder(String userId) {
        // 1 查询用户地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(System.out::println);

    }
}
