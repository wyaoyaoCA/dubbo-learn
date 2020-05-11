package study.wyy.dubbo.consumer.service.impl;

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


    private final UserService userService;

    public OrderServiceImpl(UserService userService) {
        this.userService = userService;
    }

    public void initOrder(String userId) {
        // 1 查询用户地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(System.out::println);

    }
}
