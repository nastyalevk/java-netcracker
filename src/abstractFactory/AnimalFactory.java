package abstractFactory;

import abstractFactory.animal.api.Animal;
import abstractFactory.animal.impl.Bear;
import abstractFactory.animal.impl.Dog;
import abstractFactory.animal.impl.Duck;

public class AnimalFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(type)) {
            return new Duck();
        }else if("Bear".equalsIgnoreCase(type)){
            return new Bear();
        }

        return null;
    }
}
