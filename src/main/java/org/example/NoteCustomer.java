package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.example.NoteCatalog.totalNotebook;

public class NoteCustomer {
    public static Set<Notebook> filter(Set<Notebook> notebooks) {
        System.out.println("Выберите Операционную систему, введя первую букву навания");
        System.out.println("W = \"Windows\", U = \"Ubuntu\", F = \"Fedora\", C = \"Chrome OS\", S = \"Solaris\"");
        System.out.println("или любой символ, если не имеет значения");
        Scanner scanner = new Scanner(System.in);
        String os = scanner.nextLine();
// Здесь должен быть код)))
        System.out.println("Введите минимальное значение Оперативной памяти");
        int ram = scanner.nextInt();
// Здесь должен быть код)))
        System.out.println("Введите минимальное значение Размера экрана");
        double screenSize = scanner.nextDouble();
// Здесь должен быть код)))
        for (int i = 1; i <= totalNotebook; i++) {
            System.out.println("notebooks = " + notebooks); // эта часть только для проверки работы программы

        }
        return notebooks;
    }
}

 /*   public static HashMap<String, String[]> arrParams = new HashMap<>();

    public static HashMap<String, String[]> getArrParams() {
        arrParams.put("Оперативная память", arrRam);
        arrParams.put("Размер экрана", arrScreenSize);
        arrParams.put("Операционная система", arrOs);
        return arrParams;
    }

*/


