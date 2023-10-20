package org.example;

import java.util.ArrayList;

public class Poligon<Vertex> {
    private int id;
    private String name;
    private ArrayList<Vertex> vertices;

    public Poligon(int id, String name) {
        this.id = id;
        this.name = name;
        this.vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex vertex) {
        this.vertices.add(vertex);
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }
}
