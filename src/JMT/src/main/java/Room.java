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

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", readyToRenovation=" + readyToRenovation +
                ", haveBalcony=" + haveBalcony +
                ", numberOfWindow=" + numberOfWindow +
                ", furnitureSet=" + furnitureSet +
                ", appliancesSet=" + appliancesSet +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isReadyToRenovation() {
        return readyToRenovation;
    }

    public void setReadyToRenovation(boolean readyToRenovation) {
        this.readyToRenovation = readyToRenovation;
    }

    public boolean isHaveBalcony() {
        return haveBalcony;
    }

    public void setHaveBalcony(boolean haveBalcony) {
        this.haveBalcony = haveBalcony;
    }

    public int getNumberOfWindow() {
        return numberOfWindow;
    }

    public void setNumberOfWindow(int numberOfWindow) {
        this.numberOfWindow = numberOfWindow;
    }

    public Set<Furniture> getFurnitureSet() {
        return furnitureSet;
    }

    public void setFurnitureSet(Set<Furniture> furnitureSet) {
        this.furnitureSet = furnitureSet;
    }

    public Set<Appliances> getAppliancesSet() {
        return appliancesSet;
    }

    public void setAppliancesSet(Set<Appliances> appliancesSet) {
        this.appliancesSet = appliancesSet;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAssembled() {
        return assembled;
    }

    public void setAssembled(boolean assembled) {
        this.assembled = assembled;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Furniture.count = count;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRequiredVoltage() {
        return requiredVoltage;
    }

    public void setRequiredVoltage(int requiredVoltage) {
        this.requiredVoltage = requiredVoltage;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Appliances.count = count;
    }

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

