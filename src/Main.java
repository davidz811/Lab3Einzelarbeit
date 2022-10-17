import note.UniNote;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();
        myList.add(84);
        myList.add(62);
        myList.add(28);
        myList.add(32);
        myList.add(75);
        System.out.println(UniNote.not_enough(myList));
        System.out.println(UniNote.durchschnitt(myList));
        System.out.println(UniNote.abrunden(myList));
    }
}