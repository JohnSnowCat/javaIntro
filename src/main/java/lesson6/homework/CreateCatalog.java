package lesson6.homework;

import java.util.ArrayList;
import java.util.List;

public class CreateCatalog {
    public static List<NoteBook> createCatalog(){
        List<NoteBook> catalog = new ArrayList<>();
        catalog.add(new NoteBook("Xiaomi", "Windows",
                2, 500, "Grey"));
        catalog.add(new NoteBook("Acer", "Windows",
                1, 1000, "Black"));
        catalog.add(new NoteBook("Apple", "MacOs",
                3, 1000, "Grey"));
        catalog.add(new NoteBook("Xiaomi", "Windows",
                1, 1000, "White"));
        catalog.add(new NoteBook("Xiaomi", "Windows",
                4, 1000, "Grey"));
        return catalog;
    }

}
