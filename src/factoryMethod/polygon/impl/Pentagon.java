package factoryMethod.polygon.impl;

import factoryMethod.polygon.api.Polygon;

public class Pentagon implements Polygon {
    @Override
    public String getType() {
        return "Pentagon";
    }
}
