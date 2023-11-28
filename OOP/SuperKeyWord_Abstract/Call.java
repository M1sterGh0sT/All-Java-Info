package AllInfo.OOP.SuperKeyWord_Abstract;

public class Call {
    public static void main(String[] args) {

        // create Parent class
        Parent parentC = new Parent("DeadPool", 31);

        // create Child class
        Child childC = new Child("DeadPool", 31, "Immortal");

        System.out.println(parentC.toString() + "\n");
        System.out.println(childC.toString());

        childC.say();
        childC.say2();

    }
}
