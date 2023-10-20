package org.example;

import java.util.ArrayList;

public class ModelStore {
    private ArrayList<PoligonalModel> models;

    public ModelStore() {
        this.models = new ArrayList<PoligonalModel>();
    }

    public void addModel(PoligonalModel model) {
        this.models.add(model);
    }

    public void removeModel(PoligonalModel model) {
        this.models.remove(model);
    }

    public PoligonalModel getModel(int id) {
        for (PoligonalModel model : models) {
            if (model.getId() == id) {
                return model;
            }
        }
        return null;
    }

    public ArrayList<PoligonalModel> getAllModels() {
        return this.models;
    }
}
