package factoryMethod.polygon.impl;

import factoryMethod.polygon.api.Polygon;

public class Square implements Polygon {
    @Override
    public String getType() {
        return "Square";
    }
}
