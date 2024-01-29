enum Laptop {
    Macbook(2000), Surface(1500), Lenevo(1300), Asus(1200);

    private int price;

    private Laptop() {
        price = 0;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        
        Laptop lap = Laptop.Macbook;

        System.out.println(lap.getPrice());
        
        for(Laptop lap1 : Laptop.values()) {
            System.out.println(lap1 + " : " + lap1.getPrice());
        }
    }    
}
