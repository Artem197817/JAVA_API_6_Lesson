package org.example;

import java.util.*;
import java.lang.*;

public class NoteCatalog {
    static Random random = new Random();
    static String[] arrRam = {"4", "8", "12", "16", "32"};
    static String[] arrDrive = {"SSD", "HDD"};
    static String[] arrScreenSize = {"11.6", "13.0", "14.0", "15.6", "17.0"};
    static String[] arrBrand = {"Sony", "Lenovo", "Fujitsu", "HP", "Toshiba"};
    static String[] arrOs = {"Windows", "Ubuntu", "Fedora", "Chrome OS", "Solaris"};
    static String[] arrColor = {"black", "white", "red", "silver", "gold"};
    static int totalNotebook = 170;

    /**
     * @return
     */
    public static Set<Notebook> fill() {
        Set<Notebook> notebookSet = new HashSet<>();
        for (int i = 1; i <= totalNotebook; i++) {
            notebookSet.add(new Notebook(Integer.parseInt(sample(arrRam)),
                    sample(arrDrive),
                    Double.parseDouble(sample(arrScreenSize)),
                    sample(arrBrand),
                    sample(arrOs),
                    sample(arrColor)));
        }
        return notebookSet;
    }

    /**
     *
     * @param arr
     * @return
     */
    private static String sample(String[] arr) {
        return arr[random.nextInt(arr.length)];
    }

}