package org.example;

import java.awt.*;

public class Texture {
    private int id;
    private String name;
    private Image image;

    public Texture(int id, String name, Image image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public void changeImage(Image image) {
        this.image = image;
    }
}