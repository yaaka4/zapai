package projava;

public class FigureSample {
    interface Figure {
        int width();
        int height();
    }

    record Box(int width, int height) implements Figure {}
    record Oval(int width, int height) implements Figure {}
}
