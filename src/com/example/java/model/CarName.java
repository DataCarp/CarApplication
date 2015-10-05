package com.example.java.model;

public enum CarName {
    FORD("Ford"), CHEVY("Chevy");

    private String name;

    CarName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
