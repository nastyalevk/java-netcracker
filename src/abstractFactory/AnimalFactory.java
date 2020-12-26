package abstractFactory;

import abstractFactory.animal.Animal;
import abstractFactory.animal.Bear;
import abstractFactory.animal.Dog;
import abstractFactory.animal.Duck;

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
