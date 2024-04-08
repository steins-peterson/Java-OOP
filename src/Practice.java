class Human{
    String name;
    String gender;
    int age;

    public Human(String name, String gender, int age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void bath(){
        System.out.println(name +" bathes regularly!");
    }
    public void eats(){
        System.out.println(name + " eats regularly!");
    }
}
public class Practice {
    public static void main(String[] args) {
        Human h1 = new Human("John", "Male", 47);

        h1.bath();
        h1.eats();

        System.out.println(h1.name);
        System.out.println(h1.age);
    }
}
