package com.example.FactoryMethod;

/**
 * Created by ali on 12/24/15.
 */
public class NYMobileFactory extends MobileFactory {
    @Override
    public SpiceMobile constructMobile(String model) {

        SpiceMobile mobile = null;

        if (model.equalsIgnoreCase("SpiceFire")) {
            mobile = new SpicePlus();
            mobile.setPrice(200);
        } else if (model.equalsIgnoreCase("SpiceMono")) {
            mobile = new SpiceFire();
            mobile.setPrice(280);
        }

        return mobile;
    }
}