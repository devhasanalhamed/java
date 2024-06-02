// Polymorphism
/*
 means "many forms",
 and it occurs when we have many classes
 that are related to each other by inheritance.
 */
public class Example12 {

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.animalSound();

        Dog dog = new Dog();

        dog.animalSound();


    }

}

class Animal {
    public void animalSound() {
        System.out.println("This animal make sounds");
    }
}

class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("This cat says: meow meow 🐈");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("This dog says: woof woof 🐕");
    }
}