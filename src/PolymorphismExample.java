class Animal{
    public void makeSound(){
        String name;
        System.out.println("Make a generic sound!");
    }
}

class Dog extends Animal{
    String name;
    @java.lang.Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Bat extends Animal{
    String name;
    @java.lang.Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.name = "Shelby";
        mydog.makeSound();

        Bat c1 = new Bat();
        c1.name = "cc";
        c1.makeSound();
    }
}
