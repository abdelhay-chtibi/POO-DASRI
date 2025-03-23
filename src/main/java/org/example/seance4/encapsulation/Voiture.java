package org.example.seance4.encapsulation;

public class Voiture {
    private int model;
    private String type;

    public Voiture(int model, String type) {
        this.model = model;
        this.type = type;
    }

    public int getModel() {
        return model;
    }

    public String getType() {
        return type;
    }
}

