package com.example.FactoryMethod;

/**
 * Created by ali on 12/24/15.
 */
public class FactoryMethodPatternDemo {
    public static void main(String[] args) {

        MobileFactory factory = new LondonMobileFactory();
        SpiceMobile mobile = factory.produceMobile("SpiceFire");
        System.out.println("LPrice= "+mobile.getPrice());


        MobileFactory nyFactory = new NYMobileFactory();
        SpiceMobile mobile2 = nyFactory.produceMobile("SpiceMono");
        System.out.println("NYPrice= "+mobile2.getPrice());

        MobileFactory bdFactory = new BDMobileFactory();
        SpiceMobile mobile3 = bdFactory.produceMobile("Nokia");
        System.out.println("BDPrice= "+mobile3.getPrice());


    }
}
