package abstractFactory;

import abstractFactory.color.impl.Black;
import abstractFactory.color.impl.Brown;
import abstractFactory.color.api.Color;
import abstractFactory.color.impl.White;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String type) {
        if ("Black".equalsIgnoreCase(type)) {
            return new Black();
        } else if ("Brown".equalsIgnoreCase(type)) {
            return new Brown();
        }else if("White".equalsIgnoreCase(type)){
            return new White();
        }

        return null;
    }
}
