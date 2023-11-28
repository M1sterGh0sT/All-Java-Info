package AllInfo.OOP.SuperKeyWord_Abstract;

public class Child extends Parent {

    String power;

    Child(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString(){
        System.out.println("Call from Child Class");
        return super.toString() + "\nPower: " + this.power;
    }

}
