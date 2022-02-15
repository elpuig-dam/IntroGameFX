package dam.mp3.uf5.introgamesfx.sprites;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Sprite {
    private Image image;
    private double width, height, posX, posY;

    public abstract void move();

    public Sprite(Image image) {
        setImage(image);
    }

    public void setX(double x) {
        posX = x;
    }
    public void setY(double y) {
        posY = y;
    }
    public double getX() {
        return posX;
    }
    public double getY() {
        return posY;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    private void setImage(Image image) {
        this.image = image;
        width = image.getWidth();
        height = image.getHeight();
    }

    public void render(GraphicsContext gc) {
        gc.drawImage(image, posX, posY);
    }

    public void clear(GraphicsContext gc) {
        gc.clearRect(posX,posY, width, height);
    }

    public Rectangle2D getBoundary() {
        return new Rectangle2D(posX,posY,width,height);
    }

    public boolean isClicked(Point2D p) {
        if(getBoundary().contains(p)) return true;
        else return false;
    }
}
