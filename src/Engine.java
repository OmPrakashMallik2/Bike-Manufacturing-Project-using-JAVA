public class Engine {
    int cc;
    int battery;
    int capacity;
    int warranty;

    Engine(int cc, int battery, int capacity, int warranty){
        this.cc = cc;
        this.battery = battery;
        this.capacity = capacity;
        this.warranty = warranty;
    }

    public void display() {
        System.out.println("Engine = "+cc+" cc, "+battery+" unit, "+capacity+" KM, "+warranty+" years");
    }
}
