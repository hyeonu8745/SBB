package com.mysite.sbb.common.interfaces.main;


import com.mysite.sbb.common.interfaces.code.CarMaker;
import com.mysite.sbb.common.interfaces.code.HyundaiMaker;
import com.mysite.sbb.common.interfaces.code.KiaMaker;
import com.mysite.sbb.common.interfaces.code.OrderManager;

public class InterfaceMain {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

//        CarMaker maker = new KiaMaker();
        CarMaker maker = new HyundaiMaker();
        manager.setMaker(maker);    // 주입 하는 방식

        manager.order();
    }

}
