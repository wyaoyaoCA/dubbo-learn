package study.wyy.dubbo.springboot.provider.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import study.wyy.dubbo.api.bean.UserAddress;
import study.wyy.dubbo.api.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：wyaoyao
 * @date ： 2020-05-11 20:51
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京朝阳区", "1", "张三", "13111111111", true);
        UserAddress address2 = new UserAddress(2, "北京昌平区", "1", "张三", "13111111111", true);
        return Arrays.asList(address1, address2);
    }
}
