public class Product {

    public Product(int id, String name, String desription,double price, int stockAmount ){
        System.out.println("yapıcı blok çalıştı");
        this.id = id;
        this.name =name;
        this.description = desription;
        this.price = price;
        this.stockAmount = stockAmount;
    }
    public Product(){

    }


    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public  String getKod(){
        return this.name.substring(0,1) + id;
    }

}
