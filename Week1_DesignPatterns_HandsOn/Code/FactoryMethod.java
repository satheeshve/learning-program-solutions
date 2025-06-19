interface Animal {
    String speak();
}

class Dog implements Animal {
    @Override
    public String speak() {
        return "Woof!";
    }
}

class Cat implements Animal {
    @Override
    public String speak() {
        return "Meow!";
    }
}

class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) return new Dog();
        else if ("cat".equalsIgnoreCase(type)) return new Cat();
        else throw new IllegalArgumentException("Unknown animal type");
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Animal a = AnimalFactory.getAnimal("dog");
        System.out.println("This is the output for 3_Factory Method Pattern");
        System.out.println("Dog says: " + a.speak());
    }
}

