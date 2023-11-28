package AllInfo.OOP.ExampleWithOnjectParameter;

public class StoringSMTH {

    static int productsInFridge;
    void store(CreateSmth name) {   // create object as a parameter

        System.out.println("The " + name.product + " stored in fridge");
        productsInFridge++;
    }


    void say() {
        System.out.println("Hey");
    }

    static void checkProducts(){

        if (productsInFridge != CreateSmth.amount) {
            System.out.println("You have less products in fridge then you bought \n Products in fridge" + productsInFridge + " " +
                    "You bought " + CreateSmth.amount);
        } else {
            System.out.println("You have " + productsInFridge + " products in your fridge");
        }
    }

}
