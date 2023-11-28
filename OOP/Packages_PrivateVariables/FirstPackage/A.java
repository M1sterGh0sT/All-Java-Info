package AllInfo.OOP.Packages_PrivateVariables.FirstPackage;

public class A {


    public static void main(String[] args) {



//        System.out.println(c.name); // cannot print the name because name is visible just in package where C class
                                     // everything what is the out the package will be not visible


        D d = new D("Mister Ghost", 110011001, 100000000);

        D c = new D("Mister", 1100110, 1620300530);

        D b = new D(c);


        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getScore());


        d.setName("Ghossst");
        System.out.println(d.getName());

        c.copy(d);

        System.out.println("\n\nStoring address in \"d\" instance: " + d);
        System.out.println("Storing address in \"c\" instance: " + c);
        System.out.println("Storing address in \"b\" instance: " + b);


        System.out.println("\n" + b.getName());
        System.out.println(b.getAge());
        System.out.println(b.getScore());



    }

}
