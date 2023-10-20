package org.example;

import java.util.ArrayList;

public class PoligonalModel {
    private int id;
    private String name;
    private ArrayList<Texture> textures;
    private ArrayList<Poligon> poligons;

    public PoligonalModel(int id, String name) {
        this.id = id;
        this.name = name;
        this.textures = new ArrayList<Texture>();
        this.poligons = new ArrayList<Poligon>();
    }

    public void addTexture(Texture texture) {
        this.textures.add(texture);
    }

    public void removeTexture(Texture texture) {
        this.textures.remove(texture);
    }

    public void addPoligon(Poligon poligon) {
        this.poligons.add(poligon);
    }

    public void removePoligon(Poligon poligon) {
        this.poligons.remove(poligon);
    }

    public int getId() {
        return 0;
    }
}