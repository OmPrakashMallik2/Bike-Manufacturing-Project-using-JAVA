public class Color {
    String tank;
    String head;
    String body;

    Color(String tank, String head, String body){
        this.tank = tank;
        this.head = head;
        this.body = body;
    }

    public void display() {
        System.out.println("Colors = Tanky: "+tank+", Aigher: "+head+", Body: "+body);
    }
}
