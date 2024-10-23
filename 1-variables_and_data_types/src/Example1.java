

public class Example1 {

    public static void main(String[] args) {
//        Data that you specify while writing the code held inside the memory
//        There are two types of data:
//        - Primitive Types: where the variable stores the value
//        - Reference(Non-Primitive) Types: where the variable stores the reference of the (complex) value
        /*

        int variable x = 15;
        String variable s = "Hello"

    V     Memory   Address
        ~~~~~~~~~~
    x   |   15   |   101
        ~~~~~~~~~~
    s   | ~1005~ |   102
        ~~~~~~~~~~
        |        |   ...
        ~~~~~~~~~~
        | Hello  |   1005
        ~~~~~~~~~~

         */


        // Declaration and initialization -> [DataType] [Name] = [Value];
        // Note: java is case sensitive.

        String myName = "Mohammed";
        String myFriend = "Ahmed";

//        Use escape character:
//        \n: new line
//        \t: tab

        System.out.print("My name is: " + myName + "\n");
        System.out.print("My friend's name is:" + myFriend + "\n");

        System.out.println("--------------------------");

        System.out.println("My name is: " + myName);
        System.out.println("My friend's name is: " + myFriend);
    }
}

