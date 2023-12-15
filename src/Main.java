import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(125, 200, 500000, 5);
        Color color = new Color("red", "black and red", "red");
        Model model = new Model("Glamour BS6", 2023);
        Brand brand = new Brand("Hero");
        Price price = new Price(102999.00);
        Name name = new Name(brand, model);

        MyBike bike1 = new MyBike(engine, model, color,brand, price, name);
        bike1.display();

        Engine engine2 = new Engine(160, 300, 500000, 3);
        Color color2 = new Color("Black", "Black", "Black");
        Model model2 = new Model("Apache BS6", 2024);
        Brand brand2 = new Brand("TVS");
        Price price2 = new Price(156999.00);
        Name name2 = new Name(brand2, model2);

        MyBike bike2 = new MyBike(engine2, model2, color2,brand2, price2, name2);
        bike2.display();
    }
}