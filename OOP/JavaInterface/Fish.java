package AllInfo.OOP.JavaInterface;

public class Fish implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("Run away from big fish");
    }

    @Override
    public void hunt() {
        System.out.println("Hunting a smaller fish");
    }


}
