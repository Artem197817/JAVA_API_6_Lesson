package org.example;

import java.util.*;

public class NoteCustomer {
    private static int ram;
    private static double screenSize;
    private static String os;
    public static  List<Notebook> notebookFilter = new ArrayList<>();
    public static void filter(Set<Notebook> notebooks) {
        System.out.println("Выберите Операционную систему, введя первую букву навания");
        System.out.println("W = \"Windows\", U = \"Ubuntu\", F = \"Fedora\", C = \"Chrome OS\", S = \"Solaris\"");
        Scanner scanner = new Scanner(System.in);
        os = scanner.nextLine();

        System.out.println("Введите минимальное значение Оперативной памяти [4 - 32]");

        try {
            ram = scanner.nextInt();
        } catch (InputMismatchException e) {
            //System.out.println("exception caught int");
            ram = 0;
            scanner.nextLine();
        }

        System.out.println("Введите минимальное значение Размера экрана [11 - 17]");

        try {
            screenSize = scanner.nextDouble();
        } catch (InputMismatchException e) {
            //System.out.println("exception caught double");
            //screenSize = 0.0;
            screenSize = 0;
        }
        scanner.close();



        notebookFilter = notebooks.stream()
                .filter(x -> ram <= x.getRam())
                .filter(x -> os.equalsIgnoreCase(String.valueOf(x.getOs().charAt(0))))
                .filter(x -> screenSize <= x.getScreenSize())
                .toList();

       /* Set<Notebook> notebookFromFilter = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (ram <= notebook.getRam()
                    && os.equalsIgnoreCase(String.valueOf(notebook.getOs().charAt(0)))
                    && screenSize <= notebook.getScreenSize()) {
                notebookFromFilter.add(new Notebook(notebook.getRam(),
                        notebook.getDrive(),
                        notebook.getScreenSize(),
                        notebook.getBrand(),
                        notebook.getOs(),
                        notebook.getColor()));
            }
        } */
    }
}
// Наплодила очень много лишних объектов. Зачем?
// Все переменные используемые в классе принято инициализировать вначале с применением модификаторов доступа.
// обрати внимание что метод filter в моем исполнении ничего не возврвщает.
// он создает фильтрованный лист и мы просто обращаемся к нему из других классов напрямую.
// учи Stream многие вопросы становятся проще))



