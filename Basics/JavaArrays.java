package AllInfo.Basics;

import javax.swing.*;
import java.util.*;

public class JavaArrays {

    public static void main(String[] args) {

        int [] intArr = new int [3];
        double [] doubleArr = new double [3];
        String [] strArr = new String [3];

        // or

        int[] intArr2 = new int[3];
        double[] doubleArr2 = new double[3];
        String[] strArr2 = new String[3];




        String[] array = new String[3];    // set how many items will be in array
        array[0] = "Hi";
        array[1] = "Hello";
        array[2] = "Halo";

        for (int j = 0; j<array.length; j++) {
            System.out.println(array[j]);
        }


        // 2D array
        int[][] array_2d = new int[3][3];

        array_2d[0][0] = 0;
        array_2d[0][1] = 1;
        array_2d[0][2] = 1;
        array_2d[1][0] = 1;
        array_2d[1][1] = 0;
        array_2d[1][2] = 1;
        array_2d[2][0] = 1;
        array_2d[2][1] = 1;
        array_2d[2][2] = 0;




        System.out.print("\n\n");



        for (int j = 0; j < array_2d.length; j++) {
            System.out.println();
            for (int s = 0; s < array_2d[j].length; s++) {
                System.out.print(array_2d[j][s] + "  ");
            }
        }

        System.out.print("\n\n");

        String [][] array2_2d = {
                {"0",".",".",".","0"},
                {".","0","$","0","."},
                {".","$","0","$","."},
                {".","0","$","0","."},
                {"0",".",".",".","0"},
        };

        for(int j = 0; j < array2_2d.length; j++) {
            System.out.println();
            for(int s = 0; s < array2_2d[j].length; s++) {
                System.out.print(array2_2d[j][s] + "  ");
            }
        }



        System.out.print("\n\n");

         // lists
        // in lists is not important to mention the size of the list, in arrays is important

        ArrayList<String> list = new ArrayList<String>();

        list.add("Hi");
        list.add("Hello");
        list.add("Hallo");

        list.set(0, "Ola"); // replace method or array[0] = "something"
        list.remove(0); // remove element by it index
        // list.clear(); // delete all items in list

        for(int j = 0; j < list.size(); j ++) {     // instead of length -> size
            System.out.println(list.get(j));       // [] -> get
        }


        ArrayList<ArrayList<String>> allProducts = new ArrayList();

        ArrayList<String> fruits = new ArrayList();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Coco");
        fruits.add("Orange");

        ArrayList<String> vegetables = new ArrayList();
        vegetables.add("Potato");
        vegetables.add("Tomatoes");
        vegetables.add("Cucumber");
        vegetables.add("Onions");


        ArrayList<String> sweats = new ArrayList();
        sweats.add("Ice-Cream");
        sweats.add("Chocolate");
        sweats.add("Cake");
        sweats.add("Cookie");

        allProducts.add(fruits);
        allProducts.add(vegetables);
        allProducts.add(sweats);

        System.out.println(allProducts);

        for (int j = 0; j < allProducts.size(); j++) {
            System.out.println();
            for (int s = 0; s < allProducts.get(j).size(); s++) {
                System.out.print(allProducts.get(j).get(s) + "  ");
            }
        }


    }

}
