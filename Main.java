public class Main {
    public static void main(String[] args) {

        Store myStore = getStore();

        for (Toy toy : myStore.getToys())
            System.out.println(toy);

        System.out.println();

        Raffle raffle = new Raffle();
        raffle.put(myStore.getToys());

        raffle.getRaffle();









    }
    public static Store getStore() {
        Store store = new Store();
        store.addToy(new Toy(1, 3, "Игрушечная машинка"));
        store.addToy(new Toy(2, 4, "Игрушка Робот"));
        store.addToy(new Toy(3,6, "Плюшевый мишка"));
        store.addToy(new Toy(4, 1, "Конструктор"));
        return store;
    }
}
