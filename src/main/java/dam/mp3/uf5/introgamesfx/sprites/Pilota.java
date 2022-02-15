package dam.mp3.uf5.introgamesfx.sprites;

import dam.mp3.uf5.introgamesfx.config.WindowSettings;
import javafx.scene.image.Image;

public class Pilota extends Sprite {
    private Image image;
    private double velX, velY;
    private int dirX, dirY;

    public Pilota(Image image) {
        super(image);
        setX(Math.random() * WindowSettings.WIDTH);
        setY(Math.random() * WindowSettings.HEIGHT);
        this.velX = 1.0f;
        this.velY = 1.0f;
        this.dirX = 1;
        this.dirY = 1;
    }

    /**
     * El moviment de la pilota és gestionat per la mateixa pilota
     * En aquest exemple només cal generalitzar les mides per on es
     * pot moure.
     */
    @Override
    public void move() {
        if(dirX == 1) {
            setX(getX() + velX);
            if(getX() >= WindowSettings.WIDTH - getWidth()) dirX = (-1)*dirX;
        }else {
            setX(getX() - velX);
            if(getX() <= 0) dirX = (-1)*dirX;
        }
        if(dirY == 1){
            setY(getY() + velY);
            if(getY() >= WindowSettings.HEIGHT - getHeight()) dirY = (-1)*dirY;
        }
        else {
            setY(getY() - velY);
            if(getY() <= 0) dirY = (-1)*dirY;
        }
    }

    public void changeDir() {
        double t = Math.random();
        if(0.33 > t) dirX = dirX*(-1);
        if(0.33 < t && 0.66 > t) dirY = dirY*(-1);
        if(0.66 < t) {
            dirY = dirY*(-1);
            dirX = dirX*(-1);
        }

    }

    public void setDirection(String direction) {
        switch (direction) {
            case "RIGHT":
                dirX = 1;
                break;
            case "LEFT":
                dirX = -1;
                break;
            case "DOWN":
                dirY = 1;
                break;
            case "UP":
                dirY = -1;
                break;
        }
    }



}
