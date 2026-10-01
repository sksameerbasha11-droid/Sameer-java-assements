class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Rabbit inherits Animal
class Rabbit extends Animal {

    void jump() {
        System.out.println("Rabbit is jumping");
    }
}

public class Main {
    public static void main(String[] args) {

        // Create Dog object
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println();

        // Create Rabbit object
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.jump();
    }
}
