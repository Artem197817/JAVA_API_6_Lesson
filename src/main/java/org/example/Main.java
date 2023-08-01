package org.example;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин ноутбуков");
        System.out.println("Введите 1, чтобы посмотреть весь ассортимент");
        System.out.println("Введите 2, чтобы задать критерии поиска");
        System.out.println("Введите 0, чтобы выйти и подумать еще");


        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice) {
            case ("0"):
                System.out.println("Досвидосики");
                break;
            case ("1"):
                Set<Notebook> notebooks = NoteCatalog.fill();
                break;
            case ("2"):
                System.out.println("Мы пока не научились писать код для фильтров... Но в скором времени напишем что-то подобное)))");
                break;
            default:
                System.out.println("Некорректный ввод");
                break;
        }
    }
}