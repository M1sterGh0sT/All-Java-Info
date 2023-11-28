package AllInfo.OOP.Files;

//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Call {
    public static void main(String[] args) {

//        File file = new File("C:/Users/somet/IdeaProjects/FirstProject/src/AllInfo/OOP/Files/text.txt"); // use full path
//
//
//        if (file.exists()) {
//            System.out.println(file.getPath());
//            System.out.println(file.isFile());
//
//        } else {
//            System.out.println("Nope");
//
//        }


//        try {
//            // use full path to manipulate with files
//            FileWriter file2 = new FileWriter("C:/Users/somet/IdeaProjects/FirstProject/src/AllInfo/OOP/Files/text.txt");
//            file2.write("Hello");
//            file2.append("\nHi");
//            file2.close();
//
//
//        } catch (IOException error) {
//            error.printStackTrace();
//        }



        try {
            FileReader file3 = new FileReader("C:/Users/somet/IdeaProjects/FirstProject/src/AllInfo/OOP/Files/file.txt");

            int content = file3.read();

            while (content != -1) {
                System.out.print((char)content);
                content = file3.read();     // read next character

            }
            file3.close();



        } catch (IOException error) {
            error.printStackTrace();
        }

    }
}
