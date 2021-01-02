package factoryMethod.polygon.impl;

import factoryMethod.polygon.api.Polygon;

public class Triangle implements Polygon {
    @Override
    public String getType() {
        return "Triangle";
    }
}
