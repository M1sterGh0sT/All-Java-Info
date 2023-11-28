package AllInfo.OOP.CarExample;

public class CarClass {

    String name = "Porsche";
    int createdDate = 2023;
    String model = "G250";
    double maxSpeed = 255.90;


    // constructor must have the same name as a class name
    CarClass(String name, String model, int createdDate) {  // like an init function
        this.name = name;
        this.model = model;
        this.createdDate = createdDate;

        // System.out.println("Name: " + name + "\nModel: " + model + "\nDate of creating: " + createdDate);

    }


    CarClass(String name, String model, int createdDate, double maxSpeed) {
        this.name = name;
        this.model = model;
        this.createdDate = createdDate;
        this.maxSpeed = maxSpeed;
    }

    CarClass() {

    }

    // override toString method

    public String toString(){
        return "It\'s not exactly an address of the class object";
    }

    void displayInfo() {

        System.out.println("Name: " + this.name + "\nModel: " + this.model + "\nDate of creating: " + this.createdDate);

    }



}
