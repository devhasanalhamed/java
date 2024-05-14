public class Example25 extends Thread {
    //    Concurrency Problems
    /*
    Because threads run at the same time as
    other parts of the program, there is no
    way to know in which order the code will run.
     */

    public static int amount = 0;

    public static void main(String[] args) {
        Example25 thread = new Example25();
        thread.start();
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);

    }

    @Override
    public void run() {
        amount++;
        super.run();
    }
}
