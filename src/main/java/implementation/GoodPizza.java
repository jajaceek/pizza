package implementation;

import api.IPizza;

public class GoodPizza implements IPizza {

    private int price;
    private String name;

    public GoodPizza(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        //TODO
        return price;
    }

    public String getName() {
        //TODO
        return name;
    }
}
