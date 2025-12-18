public class Product {
    private String name;
    private int stock;

    public Product(String n, int s){
        name=n;
        stock=s;
    }
    public void buyOne(){
        if(stock>0){
            stock--;
            System.out.println("1 item bought.");
        } else {
            System.out.println("Out of stock!");
        }
    }
    public void printInfo() {
        System.out.println("Product: " + name + ", Stock: " + stock);
    }

    public String getName() {
        return name;
    }

}
