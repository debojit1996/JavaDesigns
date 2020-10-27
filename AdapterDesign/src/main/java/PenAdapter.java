import pilot.PilotPen;

public class PenAdapter implements Pen{
    PilotPen pilot = new PilotPen();

    public void write(String str) {
        pilot.mark(str);
    }
}
