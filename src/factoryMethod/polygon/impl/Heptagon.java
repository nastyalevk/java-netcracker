package factoryMethod.polygon.impl;

import factoryMethod.polygon.api.Polygon;

public class Heptagon implements Polygon {
    @Override
    public String getType() {
        return "Heptagon";
    }
}
