public class Room {

    int length;
    int width;
    int height;
    boolean readyToRenovation;
    boolean haveBalcony;
    int numberOfWindow;
    static int longestWall;



    public static int getLongestWall() {
        return longestWall;
    }

    public Room(int length, int width, int height, boolean readyToRenovation, boolean haveBalcony, int numberOfWindow) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.readyToRenovation = readyToRenovation;
        this.haveBalcony = haveBalcony;
        this.numberOfWindow = numberOfWindow;
    }

    Sofa sofa = new Sofa(3, 1, "Black", "leather");
    Armchair armchair = new Armchair("Black", "leather", 1,2);
    Computer computer = new Computer(53.2,2020);
    Table table = new Table(3,2,"Black", "Wood");
    TV tv = new TV(37.2);


}


class Sofa {

    int sofaLength;
    int sofaWidth;
    String sofaColor;
    String sofaCloth;

    public Sofa(int sofaLength, int sofaWidth, String sofaColor, String sofaCloth) {
        this.sofaLength = sofaLength;
        this.sofaWidth = sofaWidth;
        this.sofaColor = sofaColor;
        this.sofaCloth = sofaCloth;
    }
}

class Armchair {
    String armchairColor;
    String armchairCloth;
    int armchairLength;
    int armchairWidth;

    public Armchair(String armchairColor, String armchairCloth, int armchairLength, int armchairWidth) {
        this.armchairColor = armchairColor;
        this.armchairCloth = armchairCloth;
        this.armchairLength = armchairLength;
        this.armchairWidth = armchairWidth;
    }
}

class Table{
    int tableLength;
    int tableWidth;
    String tableColor;
    String tableMaterial;

    public Table(int tableLength, int tableWidth, String tableColor, String tableMaterial) {
        this.tableLength = tableLength;
        this.tableWidth = tableWidth;
        this.tableColor = tableColor;
        this.tableMaterial = tableMaterial;
    }
}

class Computer{
    double monitorDiagonal;
    int yearOfIssue;

    public Computer(double monitorDiagonal, int yearOfIssue) {
        this.monitorDiagonal = monitorDiagonal;
        this.yearOfIssue = yearOfIssue;
    }
}

class TV{
    double TVDiagonal;

    public TV(double TVDiagonal) {
        this.TVDiagonal = TVDiagonal;
    }
}
