
public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(125, 200, 500000, 5);
        Color color = new Color("red", "black and red", "red");
        Model model = new Model("Glamour BS6", 2023);
        Brand brand = new Brand("Hero");
        Price price = new Price(102999.00);
        Name name = new Name(brand, model);

        MyBike bike1 = new MyBike(engine, model, color,brand, price, name);
        bike1.Details();
    }
}