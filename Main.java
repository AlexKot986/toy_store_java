import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        Store myStore = getStore();

        for (Toy toy : myStore.getToys())
            System.out.println(toy);

        System.out.println();

        get(myStore, 10);


    }
    public static Store getStore() {
        Store store = new Store();
        store.addToy(new Toy(1, 3, "Игрушечная машинка"));
        store.addToy(new Toy(2, 4, "Игрушка Робот"));
        store.addToy(new Toy(3,6, "Плюшевый мишка"));
        store.addToy(new Toy(4, 1, "Конструктор"));
        return store;
    }

    public static void get(Store store, int number) throws IOException {

        WriterTXT writerTXT = new WriterTXT();
        Raffle raffle = new Raffle();
        List<String> lines = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            raffle.put(store.getToys());
            PriorityQueue<Toy> queue = raffle.getRaffleQueue();
            lines.add(String.format("%d -------------------------------------", i + 1));

            while (queue.size() != 0)
                lines.add(queue.poll().toString());
        }
        writerTXT.writeFile("raffle_file.txt", lines);
    }
}
