import java.util.List;
import java.util.PriorityQueue;

public class Raffle {
    private PriorityQueue<Toy> raffleQueue;

    public Raffle() { raffleQueue = new PriorityQueue<>(); }

    public PriorityQueue<Toy> getRaffleQueue() { return  raffleQueue; }

    public void put(Toy toy) { raffleQueue.add(toy); }

    public void put(List<Toy> toys) {
        for (Toy toy : toys)
            raffleQueue.add(toy);
    }

    public void getRaffle() {
        while (raffleQueue.size() != 0)
            System.out.println(raffleQueue.poll());
    }
}
