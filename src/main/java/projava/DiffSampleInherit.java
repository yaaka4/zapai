package projava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;

public class DiffSampleInherit {

    public static void main(String[] args) {
        var f = new JFrame("差分プログラミング");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var g = img.createGraphics();
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, 600, 400);
        g.drawImage(lineImage3(), 10, 10, f);
        g.drawImage(rectImage3(), 300, 80, f);
        var label = new  JLabel(new ImageIcon(img));
        f.add(label);
        f.pack();
        f.setVisible(true);
    }

    static BufferedImage lineImage() {
        var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var graphics = image.createGraphics();
        graphics.drawLine(10, 10, 400, 300);
        return image;
    }

    static BufferedImage rectImage() {
        var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var graphics = image.createGraphics();
        graphics.drawRect(10, 10, 400, 300);
        return image;
    }

//    static abstract class ImageDrawer {
//        BufferedImage createImage() {
//            var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
//            var graphics = image.createGraphics();
//            draw(graphics);
//            return image;
//        }
//
//        abstract void draw(Graphics2D g);
//    }

    @FunctionalInterface
    interface ImageDrawer {
        default BufferedImage createImage() {
            var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
            var graphics = image.createGraphics();
            draw(graphics);
            return image;
        }

        void draw(Graphics2D g);
    }

    static class LineDrawer implements ImageDrawer {
        @Override
        public void draw(Graphics2D g) {
            g.drawLine(10, 10, 400, 300);
        }

        BufferedImage lineImage() {
            return new LineDrawer().createImage();
        }
    }

    static class RectDrawer implements ImageDrawer {
        @Override
        public void draw(Graphics2D g) {
            g.drawRect(10, 10, 400, 300);
        }

        BufferedImage rectImage() {
            return new RectDrawer().createImage();
        }
    }

    BufferedImage lineImage2() {
        return new ImageDrawer() {
            @Override
            public void draw(Graphics2D g) {
                g.drawLine(10, 10, 400, 300);
            }
        }.createImage();
    }

    BufferedImage rectImage2() {
        return new ImageDrawer() {
            @Override
            public void draw(Graphics2D g) {
                g.drawRect(10, 10, 400, 300);
            }
        }.createImage();
    }

    static BufferedImage lineImage3() {
        ImageDrawer drawer = g -> g.drawLine(10, 10, 220, 180);
        return drawer.createImage();
    }

    static BufferedImage rectImage3() {
        ImageDrawer drawer = g -> g.drawRect(10, 10, 220, 180);
        return drawer.createImage();
    }

    static BufferedImage createImage(Consumer<Graphics2D> drawer) {
        var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var graphics = image.createGraphics();
        drawer.accept(graphics);
        return image;
    }

    static BufferedImage lineImage4() {
        return createImage(g -> g.drawLine(10, 10, 400, 300));
    }

    static BufferedImage rectImage4() {
        return createImage(g -> g.drawRect(10, 10, 400, 300));
    }
}
