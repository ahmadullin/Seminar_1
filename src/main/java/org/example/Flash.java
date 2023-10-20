package org.example;

import javax.swing.text.Position;

public class Flash<Rotation> {
    private int id;
    private String name;
    private PoligonalModel model;
    private Position position;
    private Rotation rotation;

    public Flash(int id, String name, PoligonalModel model, Position position, Rotation rotation) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.position = position;
        this.rotation = rotation;
    }

    public void changeModel(PoligonalModel model) {
        this.model = model;
    }

    public void move(double x, double y, double z) {
        this.position.setX(x);
        this.position.setY(y);
        this.position.setZ(z);
    }

    public void rotate(double angle) {
        this.rotation.setAngle(angle);
    }
}