package org.example;

import javax.swing.text.Position;

public class Camera<Rotation> {
    private int id;
    private String name;
    private Position position;
    private Rotation rotation;

    public Camera(int id, String name, Position position, Rotation rotation) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.rotation = rotation;
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