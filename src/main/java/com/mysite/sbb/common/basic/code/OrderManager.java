package com.mysite.sbb.common.basic.code;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderManager {

    //    private HyundaiMaker maker;
    private KiaMaker maker;

    public OrderManager(){
//        maker = new HyundaiMaker();
        maker = new KiaMaker();
    }

    public void order(){
        Money money = new Money(1000);
        System.out.println("판매상(입급) : " + money.getAmount());
        Car car = maker.sell(money);
        System.out.println("판매상(인수) : " + car.getName());
    }

}
