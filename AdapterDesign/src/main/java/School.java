
// Adapter is a structural design pattern
public class School {
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(pen);
        aw.writeAssignment("I'm a bit tired to complete my assignment");
    }
}
