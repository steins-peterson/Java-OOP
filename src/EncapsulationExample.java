class Student{
    private String name; // the student property name
    private int age; // the student property age

    public void setName(String name) { // this method is used to set the name for the user and its called a setter method
        this.name = name;
    }

    public String getName() { // this getter method is used to return the name or get the name for the user
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Luciana");
        s1.setAge(16);

        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
}
