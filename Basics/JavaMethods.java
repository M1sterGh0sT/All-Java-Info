package AllInfo.Basics;

public class JavaMethods {
    public static void main(String[] args){
        String name = "Mister Ghost";
        int points = 10000000;
        greeting(name, points);


        int x = 5;
        int y = 10;
        // System.out.println(add(x, y));


        // call overloaded methods

        int b = 7;


        int firstFunc = sum(x, y);
        System.out.println(firstFunc);

        int secondFunc = sum(x, y, b);
        System.out.println(secondFunc);

        double thirdFunc = sum(x);
        System.out.println(thirdFunc);




    }

    static void greeting(String name, int points) {     // greeting - method
        System.out.println("Hello " + name);
        System.out.println("Score: " + points);
    }

    static int add(int x, int y) {
        return x + y;
    }


    // overloaded methods

    static int sum(int x, int y) {
        System.out.println("Plus 2 number");
        return x + y;
    }

    static int sum(int x, int y, int b) {
        System.out.println("Plus 3 number");
        return x + y + b;
    }

    static double sum(int x) {
        System.out.println(x + " to the power of 2");
        return Math.pow(x, 2);
    }



}
