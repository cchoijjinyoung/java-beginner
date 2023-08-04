package mini.amusementpark.domain;

import mini.amusementpark.DiscountPolicy;

public class Ticket {
    private final int BASIC_PRICE = 10000;
    private int price = BASIC_PRICE;
    private DiscountPolicy discountPolicy;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
}
