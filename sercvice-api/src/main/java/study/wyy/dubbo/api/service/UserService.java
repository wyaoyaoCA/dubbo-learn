package study.wyy.dubbo.api.service;


import study.wyy.dubbo.api.bean.UserAddress;

import java.util.List;

public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);
}
