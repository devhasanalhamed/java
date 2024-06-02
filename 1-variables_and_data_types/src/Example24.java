public class Example24 {
    //    Creating Threads
    /*
    two methods:
    - run() method after extending Thread
     */


    public static void main(String[] args) {
        MethodOne methodOne = new MethodOne();
        methodOne.start();
        System.out.println("This code run outside the thread");


        MethodTwo methodTwo = new MethodTwo();
        Thread thread = new Thread(methodTwo);
        thread.start();
        System.out.println("This code run outside the thread");

    }
}

class MethodOne extends Thread {
    @Override
    public void run() {
        System.out.println("This code running in a thread one!");
    }
}

class MethodTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("This code running in a thread two!");
    }
}
