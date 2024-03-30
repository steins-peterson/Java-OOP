class Zebra extends Animal2{ // here we are inheriting the props from Animal2 class
    String name;
    String gender;

    public Zebra(String name, String gender) {
        super(name, gender);
    }


    public void makeSound(){
        System.out.println("heheheheh");
    }
}

class Kitty extends Animal2{
    String name;
    String gender;

    public Kitty(String name, String gender){
        super(name,gender);
    }

    public void makeSound(){
        System.out.println("UwU");
    }

}
public class InheritanceExample {
    public static void main(String[] args) {
        Zebra myzebra = new Zebra("Zebby", "female");

        Kitty myKitty = new Kitty("Whiskers", "male");

        myzebra.makeSound();

        myKitty.makeSound();
    }
}
