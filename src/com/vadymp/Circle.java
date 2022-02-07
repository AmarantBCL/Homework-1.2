package com.vadymp;

public class Circle {

    private final Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean isPointInCircle(Point point) {
        return point.getDistanceBetweenPoints(center) < radius;
    }
}
