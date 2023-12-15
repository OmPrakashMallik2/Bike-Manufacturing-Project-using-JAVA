public class MyBike {
    Engine eng;
    Model mod;
    Color col;
    Brand br;
    Price pr;
    Name nm;

    MyBike(Engine engine,Model model, Color color, Brand brand, Price price, Name name){
        eng = engine;
        mod = model;
        col = color;
        br = brand;
        pr = price;
        nm = name;
    }

    void Details(){
        System.out.println("Bike Details is : ");
        eng.display();
        mod.display();
        col.display();
        br.display();
        pr.display();
        nm.display();
    }
}
