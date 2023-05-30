package org.example;

import java.util.Objects;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "{" +
                "radius=" + radius +
                '}';
    }
}
