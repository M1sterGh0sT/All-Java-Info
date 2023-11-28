package AllInfo.Basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class leetCode {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int target = 5;


        List<Integer> res = new ArrayList<>();

        for (int j: arr) {
            for(int s : arr.subList(1, arr.size())) {
                if (j + s == target) {
                    res.add(arr.indexOf(j));
                    res.add(arr.indexOf(s));
                }
            }
        }


        System.out.println(res);



    }

}
