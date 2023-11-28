package AllInfo.OOP.Packages_PrivateVariables.SecondPackage;
import AllInfo.OOP.Packages_PrivateVariables.FirstPackage.*;


public class ExtendA extends B {
    public static void main(String[] args) {

        C c = new C();

        System.out.println(c.localVariable); // in this case we can print the name
                                   // because they are in the same folder

        ExtendA a = new ExtendA();

        System.out.println(a.code);     // we can get access to protected variable "code" as long as our class is
                                       // extended by the class in which this variable is

    }
}
