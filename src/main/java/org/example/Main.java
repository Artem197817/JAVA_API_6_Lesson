package org.example;

import java.util.*;
import java.lang.*;

import static org.example.NoteCatalog.totalNotebook;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин ноутбуков");
        System.out.println("Введите 1, чтобы посмотреть весь ассортимент");
        System.out.println("Введите 2, чтобы задать критерии поиска");
        System.out.println("Введите 0, чтобы выйти и подумать еще");

        Set<Notebook> notebooks = NoteCatalog.fill();

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice) {
            case ("0"):
                System.out.println("Досвидосики");
                break;
            case ("1"):
                System.out.println("Ноутбуки в наличии: ");
                for (Notebook notebook : notebooks) {
                    System.out.println(notebook);
                }
                break;
            case ("2"):

                Set<Notebook> notebookFromFilter = NoteCustomer.filter(notebooks);
                int counter = notebookFromFilter.size();
                if (counter == 0) {
                    System.out.println("Мы пока не научились писать код для фильтров... Но в скором времени напишем что-то подобное)))");
                } else {
                    System.out.printf("Найдено %d из %d ноутбуков\n", counter, totalNotebook);
                }
                break;
            default:
                System.out.println("Некорректный ввод");
                break;
        }
    }
}