package note;

import java.util.ArrayList;
import java.util.List;

public class UniNote {
    //ex1
    public static List<Integer> not_enough(List<Integer> myList) {
        List<Integer> newList = new ArrayList<>();
        for (int elem : myList)
            if (elem < 40.0)
                newList.add(elem);
        return newList;
    }

    //ex2
    public static double durchschnitt(List<Integer> myList) {
        double sum = 0;
        for (double elem : myList)
            sum = sum + elem;
        return sum / myList.size();
    }

    //ex3
    public static List<Integer> abrunden(List<Integer> myList) {
        List<Integer> abrundenList = new ArrayList<>();
        for (int elem : myList) {
            if (elem > 38.0) {
                if ((elem % 10) < 5) {
                    if (5 - (elem % 10) < 3)
                        abrundenList.add(elem);
                } else {
                    if (10 - (elem % 10) < 3)
                        abrundenList.add(elem);

                }
            }
        }
        return abrundenList;
    }

}
