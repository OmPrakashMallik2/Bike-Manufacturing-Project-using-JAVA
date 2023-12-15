import java.util.Date;

public class Name implements displayable {
    private Brand brand;
    private Model model;
    private final Date date = new Date();

    Name(Brand brand, Model model){
        this.brand = brand;
        this.model = model;
//        this.date = date;
    }

    @Override
    public void display() {
        System.out.println("Name = "+brand.getBrandName()+" "+model.getModelName()+" "+model.getYear()+" edition. Manufactured on: "+ date);
    }
}
