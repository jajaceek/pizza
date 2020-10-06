package Pizzeria;

import api.IOrder;
import config.Config;
import implementation.GoodPizza;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = (IOrder) context.getBean("order");
        order.printOrder();
//        IOrder order = new Order(new GoodPizza(15, "Dobra"));
//        order.printOrder();

    }
}
