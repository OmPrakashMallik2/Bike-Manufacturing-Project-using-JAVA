public class Model implements displayable {
    private String modelName;
    private int year;
    Model(String modelName, int year){
        this.modelName = modelName;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public void display() {
        System.out.println("Model = "+modelName+", "+year);
    }
}
