package abstractFactory.animal.impl;

import abstractFactory.animal.api.Animal;

public class Bear implements Animal {

    @Override
    public String getType() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Roar roar";
    }
}
