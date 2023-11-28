package AllInfo.OOP.Packages_PrivateVariables.FirstPackage;

public class D {

    private String name;

    private int age;

    private int score;

    D(String name, int age, int score) {
        this.setName(name);
        this.setAge(age);
        this.setScore(score);
    }


      // overloaded constructor
     // the same logic as a copy method however we use it for create new instance of a class and
    // paste there instance which we want to copy

    D(D val) {
        this.copy(val);
    }


     // if we want to use the private variables
    // use that gather methods to get access to the private variable

    public String getName() {   // gather methods
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }


    // setter method need to change value in the private variable

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }


    // coping instance of class

    public void copy(D val) {
        this.setName(val.getName());
        this.setAge(val.getAge());
        this.setScore(val.getScore());
    }





}
