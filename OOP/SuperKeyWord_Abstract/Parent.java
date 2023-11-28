package AllInfo.OOP.SuperKeyWord_Abstract;

public class Parent extends AbstractClass {
    String name;
    int age;

    void say2() {
        System.out.println("Call from AbstractClass");
    }

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        System.out.println("Call from Parent Class");
        return "Name: " + this.name + "\nAge " + this.age;
    }
}
