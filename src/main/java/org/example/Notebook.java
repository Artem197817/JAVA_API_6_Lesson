package org.example;

import java.util.HashMap;
import java.util.Objects;

public class Notebook {
    private int ram;
    private String drive;
    private double screenSize;
    private String brand;
    private String os;
    private String color;

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

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "Оперативная память: " + ram +
                ", Жестcкий диск: " + drive +
                ", Размер экрана: " + screenSize +
                ", Производитель: '" + brand + '\'' +
                ", Операционная система: '" + os + '\'' +
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