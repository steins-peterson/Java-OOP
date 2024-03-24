public class ClassesAndObjects {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "KitKat";
        c1.age = 2;
        c1.gender = "female";

        c1.meow();

        System.out.println(c1.name);

        c1.eat();
    }
}

class Cat{ // this is a cat class and a class must have properties and behavior
    String name; // a class has properties and this is one of the properties
    String gender;
    int age;

    public void meow(){ // this is behavior of the class
        System.out.println(name + " is meowing");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
}
