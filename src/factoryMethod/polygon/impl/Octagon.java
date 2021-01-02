package factoryMethod.polygon.impl;

import factoryMethod.polygon.api.Polygon;

public class Octagon implements Polygon {
    @Override
    public String getType() {
        return "Octagon";
    }
}