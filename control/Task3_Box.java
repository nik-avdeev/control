package control;

public class Task3_Box {
    private int x;
    private int y;
    private int z;
    private String type;
    private int weight;

    public Task3_Box(int x, int y, int z, String type, int weight) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return x * y * z;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
