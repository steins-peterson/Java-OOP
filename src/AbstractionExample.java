interface MansBf{ // interface is a set of methods and each method is treated as an abstract method.

    void love(); // this method is also treated as an abstract method and can't be implemented here
    void kiss(); // this method is also treated as an abstract method and can't be implemented here
}


abstract class Doggo{ // abstract classes and methods are used to make other classes and they tell what other classes needs to have.
    public void bark(){
        System.out.println("Woof");
    }

    public abstract void eat(); // abstract methods are not implemented in the abstract class itself. They should be
    // implemented in the class inheriting the abstract class
    // abstract classes and methods are used to make other classes and they tell what other classes needs to have.

}

class Husky extends Doggo{
    public void eat(){
        System.out.println("Eats meat lovingly");
    }
}

class Pomeranian implements MansBf{
    public void love(){
        System.out.println("Loves his human");
    }

    @Override
    public void kiss() {
        System.out.println("Mwah Mwah Mwah");
    }
}


public class AbstractionExample {
    public static void main(String[] args) {
        Husky cessa = new Husky();
        cessa.bark(); // this method is inherited from the abstract class Doggo
        cessa.eat(); // method is from Husky class itself

        Pomeranian pompom = new Pomeranian();
        pompom.kiss();
        pompom.love();
    }


}
