package AllInfo.OOP.Polymorphism;

import AllInfo.OOP.Packages_PrivateVariables.FirstPackage.B;

public class Call {

    public static void main(String[] args) {

        Car car = new Car();    // objects
        Boat boat = new Boat();
        Bike bike = new Bike();

        // all instances identify themselves as a Vehicle class




        Vehicle[] storing = {car, bike, boat};  // use datatype "Vehicle" because all classes extends by Vehicle class


        // when we iterate through storing list "go" func always override in every class
        for (Vehicle val: storing) {    // val represent the Vehicle
            val.go();
        }

    }

}
