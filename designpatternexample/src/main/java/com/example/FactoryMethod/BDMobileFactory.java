package com.example.FactoryMethod;

/**
 * Created by ali on 12/29/15.
 */
public class BDMobileFactory extends MobileFactory{
    @Override
    public SpiceMobile constructMobile(String model) {
        SpiceMobile mobile = null;

        if (model.equalsIgnoreCase("Nokia")) {
            mobile = new SpicePlus();
            mobile.setPrice(300);
        } else if (model.equalsIgnoreCase("Samsung")) {
            mobile = new SpiceBolt();
            mobile.setPrice(400);
        }

        return mobile;
    }
}
