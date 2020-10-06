package Pizzeria;

import api.IOrder;
import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = (IOrder) context.getBean(Order.class);
        order.printOrder();
    }
}
