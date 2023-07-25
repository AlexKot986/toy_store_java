import java.io.PrintWriter;

public class Toy {
    private int id;
    private int weigh;
    private String name;

    public Toy(int id, int weigh, String name) {
        this.id = id;
        this.weigh = weigh;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + " weigh: " + weigh + " name: " + name;
    }

}
