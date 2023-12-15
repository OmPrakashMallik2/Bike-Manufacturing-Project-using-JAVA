public class Name {
    Brand brand;
    Model model;
    Name(Brand brand, Model model){
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        System.out.println("Name = "+brand.brandName+" "+model.modelName+" "+model.year+" edition.");
//        brand.display();
//        model.display();
    }
}
