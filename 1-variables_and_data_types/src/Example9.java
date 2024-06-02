public class Example9 {
//    Encapsulation
    /*
    The meaning of Encapsulation,
    is to make sure that "sensitive" data is hidden from users.

    1- declare class variables/attributes as private
    2- provide public get and set methods to access and update the value of a private variable
     */

    public static void main(String[] args){
        final Encapsulation enc = new Encapsulation();
        enc.setName("Hasan");
        System.out.println(enc.getName());
    }

}

class Encapsulation {
    private String name;

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }
}
