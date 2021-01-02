package abstractFactory.animal.impl;

import abstractFactory.animal.api.Animal;

public class Dog implements Animal {
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bark bark";
    }
}
