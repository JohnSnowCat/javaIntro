package lesson6.homework;

/**
 *  * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 *  * • Создать множество ноутбуков.
 *   1 - ОЗУ
 *  * 2 - Объем ЖД
 *  * 3 - Операционная система
 *  * 4 - Цвет …
 */
public class NoteBook {

    private String manufacturer;
    private String operatingSystem;
    private int sizeOfRam;
    private int sizeOfHardDisk;
    private String color;


    public NoteBook(String manufacturer, String operatingSystem, int sizeOfRam, int sizeOfHardDisk, String color) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.sizeOfRam = sizeOfRam;
        this.sizeOfHardDisk = sizeOfHardDisk;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getSizeOfRam() {
        return sizeOfRam;
    }

    public void setSizeOfRam(int sizeOfRam) {
        this.sizeOfRam = sizeOfRam;
    }

    public int getSizeOfHardDisk() {
        return sizeOfHardDisk;
    }

    public void setSizeOfHardDisk(int sizeOfHardDisk) {
        this.sizeOfHardDisk = sizeOfHardDisk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nmanufacturer='" + manufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", sizeOfRam=" + sizeOfRam +
                ", sizeOfHardDisk=" + sizeOfHardDisk +
                ", color='" + color + '\'';
    }
}
