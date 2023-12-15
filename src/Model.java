public class Model {
    String modelName;
    int year;
    Model(String modelName, int year){
        this.modelName = modelName;
        this.year = year;
    }

    public void display() {
        System.out.println("Model = "+modelName+", "+year);
    }
}
