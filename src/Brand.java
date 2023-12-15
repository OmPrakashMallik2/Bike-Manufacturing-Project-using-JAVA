public class Brand implements displayable {
    private String brandName;
    Brand(String brandName){
        this.brandName = brandName;
    }

    @Override
    public void display() {
        System.out.println("Brand name = "+brandName);
    }

    public String getBrandName() {
        return brandName;
    }
}
