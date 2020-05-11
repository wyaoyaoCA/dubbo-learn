package study.wyy.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.wyy.dubbo.api.service.OrderService;

/**
 * @author ：wyaoyao
 * @date ： 2020-05-11 21:34
 */
public class MainApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder("1");
    }
}
