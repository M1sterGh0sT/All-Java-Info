package AllInfo.OOP.CarExample;

import AllInfo.OOP.CarExample.ArrMethod;
import AllInfo.OOP.CarExample.CarClass;

public class FirstClass {
    public static void main(String[] args) {


         // if we print empty class :
        // the console will display address of a class object


        CarClass myCar1 = new CarClass("Porsche", "G330", 2023);
        CarClass myCar2 = new CarClass("Audi", "550", 2022);
        CarClass myCar3 = new CarClass("GTR", "330", 2022, 350.20);

        // if we call the function which already has a print line we don't use print to call the function
//        myCar1.displayInfo();
        System.out.println(myCar3.name);

        CarClass myCar4 = new CarClass();
        System.out.println(myCar4.toString());  // display address of a class method


        System.out.println("\n\n");





        // create array of an objects
        ArrMethod[] arr = new ArrMethod[3];

        ArrMethod first = new ArrMethod("first");
        ArrMethod second = new ArrMethod("second");
        ArrMethod third = new ArrMethod("third");

        arr[0] = first;
        arr[1] = second;
        arr[2] = third;

        System.out.println(arr[0]); // incorrect calling element from array of object

        System.out.println(arr[0].name); // calling the name from list


        // faster way to declare array

        ArrMethod first1 = new ArrMethod("first1");
        ArrMethod second2 = new ArrMethod("second2");
        ArrMethod third3 = new ArrMethod("third3");

        ArrMethod[] array = {first1, second2, third3};

        System.out.println(array[0].name); // calling the name from list









    }
}
