public class example4 {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String


        /*
        Data types are divided into two groups:
        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
        */

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);


        char myGrade = 'B';
        System.out.println(myGrade);

        // You can provide ASCII code
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);


        // Casting

        /*
        Type casting is when you assign a value of one primitive data type to another type.
        In Java, there are two types of casting:
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
         */

        float castToDouble = 2.5f;
        double myDouble = castToDouble;
        System.out.println(myDouble);
        System.out.println(castToDouble);


        double castToInt = 9.32;
        int myInteger = (int) castToInt;
        System.out.println(castToInt);
        System.out.println(myInteger);


    }
}
