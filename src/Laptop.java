public class Laptop {
    String model;
    int price;
    String date;

    public Laptop(String model, int price, String date) {
        this.model = model;
        this.price = price;
        this.date = date;

    }

    @Override
    public String toString() {
        return "Laptop:" +
                "model=" + model + "\n" +
                "price=" + price + "\n" +
                "date=" + date;
    }
}
