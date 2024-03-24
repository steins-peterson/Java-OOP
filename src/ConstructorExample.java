class Car{
    String brand;
    String model;
    int year;

    // constructor method
    public Car(String carBrand, String carModel, int carYear){
        brand = carBrand;
        model =carModel;
        year = carYear;
    }

    public void displayInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}


public class ConstructorExample {
    public static void main(String[] args) {
        Car mycar = new Car("Nissan", "Gtr", 2024);
        mycar.displayInfo();
    }
}
