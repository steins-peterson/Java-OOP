class MyClass{
    static int count; // static variable that can be shared by all the instances of the class.
    public MyClass(){ // A constructor; the count is incremented everytime a new object is created.
        count++;
    }

    static void displayInfo(){ // static method, which can be called directly using class name without having to create an instance of a class.
        System.out.println("Number of objects created: " + count);
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        MyClass.displayInfo();

    }

}
