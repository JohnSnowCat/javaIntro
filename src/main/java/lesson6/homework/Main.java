package lesson6.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc, CreateCatalog.createCatalog());

    }

    private static void menu(Scanner sc, List<NoteBook> ctlg) {
        boolean flag = true;
        List<NoteBook> catalogCopy = new ArrayList<>(ctlg);
        while (flag) {
            System.out.println();
            System.out.println("1\tВывести список всех товаров\n" + "2\tОтфильтровать по параметрам\n" +
                    "3\tСортировать по параметрам\n" + "4\tВыход\n");
            System.out.println("Выберите желаемое действие: ");
            int select = sc.nextInt();
            List<NoteBook> myList = new ArrayList<>();

            switch (select) {
                case 1:
                    for (NoteBook s : ctlg) {
                        System.out.println("Ноутбук: " + s);
                    }
                    break;
                case 2:
                    List<NoteBook> filter = filterNoteBook(ctlg, sc);
                    if (!filter.isEmpty()) {
                        System.out.println("Результат поиска: ");
                        for (NoteBook s : filter) {
                            System.out.println(s);
                        }
                    } else {
                        System.out.println("Ничего не найдено!");
                    }
                    break;
//                case 3:
//                    sortNotebook(catalogCopy, sc);
//                    for (NoteBook s : catalogCopy) {
//                        System.out.println("Notebook " + s);
//                    }
//                    break;
                case 4:
                    System.out.println("До скорых встречь! ");
                    flag = false;
                    break;
            }
        }
    }

//    private static void sortNotebook(List<NoteBook> catalogCopy, Scanner cs) {
//
//        System.out.println("1\tManufacturer\n" +
//                "2\tOS\n" +
//                "3\tSize of RAM\n" +
//                "4\tsize of HD\n" +
//                "5\tColor\n");
//        int numberCase = cs.nextInt();
//        switch (numberCase) {
//            case 1:
//                for(NoteBook elem : catalogCopy)
//                    Arrays.sort(new String[]{elem.getManufacturer()});
//                break;
//            case 2:
//                for(NoteBook elem : catalogCopy)
//                    Arrays.sort(new String[]{elem.getOperatingSystem()});
//                break;
//            case 3:
//                for(NoteBook elem : catalogCopy)
//                    Arrays.sort(new int[]{elem.getSizeOfRam()});
//                break;
//            case 4:
//                for(NoteBook elem : catalogCopy)
//                    Arrays.sort(new int[]{elem.getSizeOfHardDisk()});
//                break;
//            case 5:
//                for(NoteBook elem : catalogCopy)
//                    Arrays.sort(new String[]{elem.getColor()});
//                break;
//        }
//    }

    public static List<NoteBook> filterNoteBook(List<NoteBook> ctlg, Scanner sc) {
        List<NoteBook> myList = new ArrayList<>();
        System.out.println("Выбери интересующий параметр: ");
        System.out.println("1\tManufacturer\n" +
                "2\tOS\n" +
                "3\tSize of RAM\n" +
                "4\tsize of HD\n" +
                "5\tColor\n");
        int partSearch = sc.nextInt();
        switch (partSearch) {
            case 1:
                System.out.println("Введи занчение: ");
                String case1 = sc.next().toLowerCase();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getManufacturer().toLowerCase().equals(case1)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 2:
                System.out.println("Введи занчение: ");
                String case2 = sc.next();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getOperatingSystem().equals(case2)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 3:
                System.out.println("Введи занчение: ");
                int case3 = sc.nextInt();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getSizeOfRam() >= case3) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 4:
                System.out.println("Введи занчение: ");
                int case4 = sc.nextInt();
                for (int i = 0; i < ctlg.size(); i++) {

                    if (ctlg.get(i).getSizeOfHardDisk() >= case4) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 5:
                System.out.println("Введи занчение: ");
                String case5 = sc.next().toLowerCase();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getColor().toLowerCase().equals(case5)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
        }
        return myList;
    }
}
