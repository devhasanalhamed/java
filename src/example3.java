public class example3 {
    public static void main(String[] args) {
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
