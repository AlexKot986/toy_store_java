import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Toy> toys;

    public Store() {
        toys = new ArrayList<>();
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void addToy(List<Toy> toys) {
        for (Toy toy : toys)
            addToy(toy);
    }
}
