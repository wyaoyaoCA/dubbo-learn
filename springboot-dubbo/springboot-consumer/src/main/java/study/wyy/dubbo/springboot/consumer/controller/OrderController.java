package study.wyy.dubbo.springboot.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.wyy.dubbo.api.service.OrderService;

/**
 * @author wyaoyao
 * @data 2020-05-12 08:21
 */
@RestController
public class OrderController {


    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("initOrder/{id}")
    public void initOrder(@PathVariable String id){
        orderService.initOrder(id);
    }
}
