package com.vadymp;

import java.util.Scanner;

public class InputManager {

    private Scanner scanner = new Scanner(System.in);
    private Circle circle;
    private PointList pointList;

    public InputManager() {
        pointList = new PointList();
    }

    public void getPoints() {
        System.out.println("Введите координаты точки: ");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        pointList.add(new Point(x, y));
        scanner.nextLine();
        getMorePoints();
    }

    public void getCircle() {
        System.out.println("Введите координаты центра окружности: ");
        System.out.print("x: ");
        int centerX = scanner.nextInt();
        System.out.print("y: ");
        int centerY = scanner.nextInt();
        System.out.println("Введите радиус окружности: ");
        System.out.print("R: ");
        int radius = scanner.nextInt();
        circle = new Circle(new Point(centerX, centerY), radius);
    }

    public void showInfo() {
        System.out.println("ТОЧКИ В ОКРУЖНОСТИ: ");
        for (Point point : pointList.getList()) {
            if (circle.isPointInCircle(point)) {
                System.out.printf("x: %d, y: %d\n", point.getX(), point.getY());
            }
        }
    }

    private void getMorePoints() {
        System.out.println("Желаете добавить ещё? [1 - да | 2 - нет]");
        String command = scanner.nextLine();
        if (command.equals("1")) {
            getPoints();
        } else if (command.equals("2")) {
            return;
        } else {
            System.out.println("Неверная команда.");
            getMorePoints();
        }
    }
}
