public class example3 {
    public static void main(String[] args) {

        //        Java has 8 primitive datatypes
//        byte, short, int, long,
//        float, double,
//        char, boolean.
//
//        Integers: are a whole number, positive, negative, or zero
//        Signed integer: means that one of the bits in the byte
//        indicate whether the number is positive or negative
//        (MSB -> 0: positive, 1: negative).
//
//        With 8 bits, an unsigned byte (without a sign bit) can represent
//        values from 0 to 255 (2 raised to the power of 8 minus 1).
//
//        Because one bit is used for the sign, a signed byte
//        can represent values from -128 to 127.
//
//        Primitives that hold integer:
//        byte: 8 bit signed integer.
//        short: 16 bit signed integer.
//        int: 32 bit signed integer.
//        long: 64 bit signed integer.
//        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

        // Assigning different type of integers
        byte b = 4;
        short sh = 16;
        int i = 32;
        // Long prefix: L
        long l = 6_421_321_321L;

        System.out.println("byte: " + b);
        System.out.println("int: " + i);
        System.out.println("short: " + sh);
        System.out.println("long: " + l);
        // Add separators to a number
        System.out.printf("long with separator: %,d", l);



        String name = "Hasan";
        int age = 27;
        double decimal = 11.11;
        float decimal2 = 11.16F;
        char character = 'd';
        boolean bool = true;

        final String finalName = "unchangeableText";

//        try {
//            finalName = "change";
//        }catch ( error){
//            System.out.println(error);
//        }

        int x = 3, y = 3, z;
        x = y = z = 7;


        System.out.println(name);
        System.out.println(age);
        System.out.println(decimal);
        System.out.println(decimal2);
        System.out.println(character);
        System.out.println(bool);
        System.out.println(x + y + z);
    }
}
