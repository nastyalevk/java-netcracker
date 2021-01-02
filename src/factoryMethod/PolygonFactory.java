package factoryMethod;

import factoryMethod.polygon.impl.Heptagon;
import factoryMethod.polygon.impl.Octagon;
import factoryMethod.polygon.impl.Pentagon;
import factoryMethod.polygon.api.Polygon;
import factoryMethod.polygon.impl.Square;
import factoryMethod.polygon.impl.Triangle;

public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            return new Triangle();
        }
        if(numberOfSides == 4) {
            return new Square();
        }
        if(numberOfSides == 5) {
            return new Pentagon();
        }
        if(numberOfSides == 7) {
            return new Heptagon();
        }
        else if(numberOfSides == 8) {
            return new Octagon();
        }
        return null;
    }
}