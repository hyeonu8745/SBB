package com.mysite.sbb.common.annotation.code;

import org.springframework.stereotype.Component;

@Component("hyundai")
public class HyundaiMaker implements CarMaker {

    @Override
    public Car sell(Money money) {
        System.out.println("현대차(입급) : " + money.getAmount());
        Car car = new Car("K5");
        System.out.println("차 이름 : " + car.getName());
        return car;
    }
}