public class Engine implements displayable {
    private int cc;
    private int battery;
    private int capacity;
    private int warranty;

    Engine(int cc, int battery, int capacity, int warranty){
        this.cc = cc;
        this.battery = battery;
        this.capacity = capacity;
        this.warranty = warranty;
    }

    @Override
    public void display() {
        System.out.println("Engine = "+cc+" cc, "+battery+" unit, "+capacity+" KM, "+warranty+" years");
    }
}
