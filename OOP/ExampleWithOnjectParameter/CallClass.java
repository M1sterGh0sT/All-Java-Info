package AllInfo.OOP.ExampleWithOnjectParameter;

public class CallClass {

    public static void main(String[] args) {

        StoringSMTH fridge = new StoringSMTH();

        CreateSmth pizza = new CreateSmth("Pizza");
        CreateSmth sushi = new CreateSmth("Sushi");
        CreateSmth apple = new CreateSmth("apple");

        fridge.store(pizza);
        fridge.store(sushi);
        System.out.println(CreateSmth.amount);

        fridge.checkProducts();


        // child class
        AdditionalFridge fridge2 = new AdditionalFridge();


        // Call the overwritten function
        fridge2.say();


        System.out.println(fridge2);


    }


}
