package abstractFactory.color.impl;

import abstractFactory.color.api.Color;

public class White implements Color {
    @Override
    public String getColor() {
        return "White";
    }
}
