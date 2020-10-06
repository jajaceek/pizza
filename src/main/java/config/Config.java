package config;

import api.IOrder;
import api.IPizza;
import implementation.ExoticPizza;
import implementation.GoodPizza;
import implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public IPizza pizza() {
        return new ExoticPizza(17, "Exotic");
//        return new GoodPizza(15, "Dobra");
    }
    @Bean
    public IOrder order(IPizza pizza) {
        return new Order(pizza);
    }
}
