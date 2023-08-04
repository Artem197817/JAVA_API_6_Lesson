package org.example;

import java.util.Objects;

public class Notebook {
    private final int ram;
    private final String drive;
    private final double screenSize;
    private final String brand;
    private final String os;
    private final String color;

    public Notebook(int ram, String drive, double screenSize, String brand, String os, String color) {

        this.ram = ram;
        this.drive = drive;
        this.screenSize = screenSize;
        this.brand = brand;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public String getDrive() {
        return drive;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "ОC: '" + os + '\'' +
                ", Оперативная память: " + ram + " гб" +
                ", Жестcкий диск: " + drive +
                ", Диагональ: " + screenSize + "\"" +
                ", Марка: '" + brand + '\'' +
                ", Цвет: '" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return ram == notebook.ram && Double.compare(screenSize, notebook.screenSize) == 0 && Objects.equals(drive, notebook.drive) && Objects.equals(brand, notebook.brand) && Objects.equals(os, notebook.os) && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, drive, screenSize, brand, os, color);
    }

}