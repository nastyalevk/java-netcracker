package abstractFactory.color.impl;

import abstractFactory.color.api.Color;

public class Black implements Color {
    @Override
    public String getColor() {
        return "Black";
    }
}
