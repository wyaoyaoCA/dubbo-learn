package study.wyy.dubbo.api.bean;

import lombok.*;

import java.io.Serializable;

/**
 * @author ：wyaoyao
 * @date ： 2020-05-11 20:46
 * 用户收货地址
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserAddress implements Serializable {
    // id
    private Integer id;
    // 用户收货地址
    private String userAddress;
    // 用户id
    private String userId;
    // 收货人
    private String consignee;
    // 联系电话
    private String phoneNum;
    // 手否默认
    private boolean isDefault;

}


