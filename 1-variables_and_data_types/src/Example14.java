// Abstraction
/*
Data abstraction is the process of hiding
certain details and showing only essential
 information to the user.

 Abstraction can be achieved with either
  abstract classes or interfaces
 */
public class Example14 {

    public static void main(String[] args) {
        final Cats cat = new Cats();
        cat.animalSound();
        cat.sleep();
    }

}

abstract class Animals {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Cats extends Animals {

    @Override
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}