public class Color implements displayable {
    private String tank;
    private String head;
    private String body;

    Color(String tank, String head, String body){
        this.tank = tank;
        this.head = head;
        this.body = body;
    }

    @Override
    public void display() {
        System.out.println("Colors = Tanky: "+tank+", Aigher: "+head+", Body: "+body);
    }
}
