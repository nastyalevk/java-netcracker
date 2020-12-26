package abstractFactory;

import abstractFactory.color.Black;
import abstractFactory.color.Brown;
import abstractFactory.color.Color;
import abstractFactory.color.White;

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
