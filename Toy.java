import java.io.PrintWriter;
import java.util.Random;

public class Toy implements Comparable<Toy>{
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

    @Override
    public int compareTo(Toy o) {
        Random random = new Random();
        return o.weigh * random.nextInt(1, 11) - this.weigh * random.nextInt(1, 11);
    }
}
