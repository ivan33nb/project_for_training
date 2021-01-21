import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Room {

    int length;
    int width;
    int height;
    boolean readyToRenovation;
    boolean haveBalcony;
    int numberOfWindow;

    public Room(int length, int width, int height, boolean readyToRenovation, boolean haveBalcony, int numberOfWindow) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.readyToRenovation = readyToRenovation;
        this.haveBalcony = haveBalcony;
        this.numberOfWindow = numberOfWindow;
    }

    Set<Furniture> furnitureSet = new HashSet<>();
    Set<Appliances> appliancesSet = new HashSet<>();


}

class Furniture {
    String name;
    double height;
    double weight;
    double width;
    String material;
    String color;
    boolean assembled;
    static int count = 1;

    public Furniture(
            String name,
            double height,
            double weight,
            double width,
            String material,
            String color,
            boolean assembled) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.material = material;
        this.color = color;
        this.assembled = assembled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return height == furniture.height &&
                weight == furniture.weight &&
                width == furniture.width &&
                Objects.equals(name, furniture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, width);
    }

    @Override
    public String toString() {
        return "Furniture № " + count++ + " name: " + name + ", height = " + height
                + ", weight = " + weight + ", width = " + width + ", material is " + material
                + ", color is " + color + ", assembled is " + assembled;
    }
}

class Appliances {
    String name;
    double height;
    double weight;
    double width;
    String color;
    int requiredVoltage;
    static int count = 1;


    public Appliances(String name, double height, double weight, double width, String color, int requiredVoltage) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.color = color;
        this.requiredVoltage = requiredVoltage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliances that = (Appliances) o;
        return height == that.height &&
                weight == that.weight &&
                width == that.width &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, width);
    }

    @Override
    public String toString() {
        return "Appliances № " + count++ + " name: " + name + ", height = " + height
                + ", weight = " + weight + ", width = " + width +
                ", color is " + color + ", requiredVoltage =  " + requiredVoltage;
    }

}

