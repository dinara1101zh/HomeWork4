import java.util.List;

public class Building {
List<Room>
    int square;
    int illumination;
    String furniture;



    public Building(int square, int illumination, String furniture) {
        this.square = square;
        this.illumination = illumination;
        this.furniture = furniture;

    }

    public void describeBuilding() {
        System.out.println("To describe building ");
    }

}