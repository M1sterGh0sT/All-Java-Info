package AllInfo.Basics;

public class JavaStatements {
    public static void main(String[] args) {

        int day = 25;


        // if/else statement
        if(day <= 10) {
            System.out.println("Just start of month");
        } else if (day > 10 && day < 20) {
            System.out.println("It could be half of the month");
        } else if (day > 20 && day <= 31) {
            System.out.println("End of the month soon");
        } else {
            System.out.println("Damn, something goes wrong");
        }

        // switch statement
        switch (day) {
            case 5: System.out.println("Just start of month");
            break;
            case 15: System.out.println("It could be half of the month");
            break;
            case 25: System.out.println("End of the month soon");
            break;
            default:  System.out.println("Damn, something goes wrong");
        }

    }
}
