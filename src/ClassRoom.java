
    public class ClassRoom {
        String studentName;
        int age;

        public ClassRoom(int age, String studentName){ // constructor anedhi initialization and memory allocation ki use avthadhi.
            this.studentName = studentName;
            this.age = age;
        }

        public void displayInfo(){
            System.out.println("The student's name is: "+ studentName);
            System.out.println("The student's age is: "+ age);
        }

        public static void main(String[] args) {
            ClassRoom student1 = new ClassRoom(15, "Steffi"); // this keyword refers to the current instance of
            // class antey edhey anamata student1 aney object ye current instance ikkada.
            student1.displayInfo();
        }
    }

