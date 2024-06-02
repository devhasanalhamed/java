// Interface
/*
    An interface is a completely "abstract class"
    that is used to group related methods with empty bodies
    interfaces can be used multiples and have no limit when
     be implemented(implements interface1, interface2 interface3).
 */
public class Example15 {
    public static void main(String[] args) {
        Catss cat = new Catss();
        cat.animalSound();
        cat.run();
    }
}

interface Animalss {
    public void animalSound();

    public void run();
}

class Catss implements Animalss {

    @Override
    public void animalSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void run() {
        System.out.println("cat running fast!!");
    }
}
