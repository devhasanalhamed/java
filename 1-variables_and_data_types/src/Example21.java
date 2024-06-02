public class Example21 {
    //    Wrapper
    /*
    Classes provide a way to use primitive
     data types (int, boolean, etc..) as objects.
     */

    public static void main(String[] args) {
        Integer x = 4;
        int y = 6;

        String convertWrapperToString = x.toString();

        System.out.println(x + y);
        System.out.println(convertWrapperToString);
    }
}
