package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoteCustomer {
    public static Set<Notebook> filter(Set<Notebook> notebooks) {
        System.out.println("Выберите Операционную систему, введя первую букву навания");
        System.out.println("W = \"Windows\", U = \"Ubuntu\", F = \"Fedora\", C = \"Chrome OS\", S = \"Solaris\"");
        Scanner scanner = new Scanner(System.in);
        String os = scanner.nextLine();

        System.out.println("Введите минимальное значение Оперативной памяти [4 - 32]");
        int ram = scanner.nextInt();

        System.out.println("Введите минимальное значение Размера экрана [11 - 17]");
        double screenSize = scanner.nextDouble();

        Set<Notebook> notebookFromFilter = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (ram <= notebook.getRam() && os.equalsIgnoreCase(String.valueOf(notebook.getOs().charAt(0))) && screenSize <= notebook.getScreenSize()) {
                notebookFromFilter.add(new Notebook(notebook.getRam(),
                        notebook.getDrive(),
                        notebook.getScreenSize(),
                        notebook.getBrand(),
                        notebook.getOs(),
                        notebook.getColor()));
            }
        }
        return notebookFromFilter;
    }
}




