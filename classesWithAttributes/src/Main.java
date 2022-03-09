public class Main {

    public static void main(String[] args) {

        Product product =new Product(1,"Laptop","Monster Laptop",12000,10);

        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Monster Laptop");
        product.setPrice(12000);
        product.setStockAmount(10);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
