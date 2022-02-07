package com.vadymp;

import java.util.ArrayList;
import java.util.List;

public class PointList {

    private List<Point> list = new ArrayList<>();

    public List<Point> getList() {
        return list;
    }

    public void add(Point point) {
        list.add(point);
    }
}
