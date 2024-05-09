// Inner classes means that a class inside another class
public class Example13 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        System.out.println(outerClass.x + innerClass.y);
        System.out.println(outerClass.getClass());
        System.out.println(innerClass.getClass());
    }
}

// They include public, private inner classes
// and also the inner class can access outer
// attribute direct


class OuterClass {
    int x = 4;

    static class InnerClass {
        int y = 6;

    }


}
