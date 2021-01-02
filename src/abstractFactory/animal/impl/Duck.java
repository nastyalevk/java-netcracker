package abstractFactory.animal.impl;

import abstractFactory.animal.api.Animal;

public class Duck implements Animal {
    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks squeks";
    }
}
