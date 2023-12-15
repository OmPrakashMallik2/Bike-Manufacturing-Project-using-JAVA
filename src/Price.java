public class Price implements displayable {
    private double price;
    Price(double price){
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Price = On-road price is: "+price);
    }
}