public class Drink {
    public String id;
    public String name;
    public int price;

    public Drink(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "(" + id + ")" + name + "\t" + price;
    }
}
