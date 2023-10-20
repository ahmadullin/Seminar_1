package org.example;

import java.util.ArrayList;

public class Scene {
    private int id;
    private String name;
    private ArrayList<Flash> objects;
    private Camera camera;

    public Scene(int id, String name) {
        this.id = id;
        this.name = name;
        this.objects = new ArrayList<Flash>();
    }

    public void addObject(Flash object) {
        this.objects.add(object);
    }

    public void removeObject(Flash object) {
        this.objects.remove(object);
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
