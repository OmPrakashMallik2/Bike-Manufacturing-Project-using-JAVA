public class MyBike implements displayable {
    private Engine eng;
    private Model mod;
    private Color col;
    private Brand br;
    private Price pr;
    private Name nm;

    MyBike(Engine engine,Model model, Color color, Brand brand, Price price, Name name){
        eng = engine;
        mod = model;
        col = color;
        br = brand;
        pr = price;
        nm = name;
    }

    @Override
    public void display(){
        System.out.println("Bike Details is : ");
        eng.display();
        mod.display();
        col.display();
        br.display();
        pr.display();
        nm.display();
    }
}
