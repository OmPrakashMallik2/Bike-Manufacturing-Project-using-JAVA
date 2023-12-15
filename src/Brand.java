public class Brand {
    String brandName;
    Brand(String brandName){
        this.brandName = brandName;
    }

    public void display() {
        System.out.println("Brand name = "+brandName);
    }
}
