package point_Odevi;

import java.util.Arrays;

public class Point {
    int x;
    int y;
    double point;
    double otherPoint;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(10, 10);
    }

    public static void drawPoint(Point... points) {
        int maxX = 0;
        int maxY = 0;
        int counter = 1;
        for (Point point : points) {
            if (point.getX() > maxX) {
                maxX = point.getX();
            }
            if (point.getY() > maxY) {
                maxY = point.getY();
            }
        }
        String[][] grid = new String[maxY + 1][maxX + 1];
        for (String[] strings : grid) {
            Arrays.fill(strings, "- ");
        }
        if (points.length > 1) {
            for (Point point : points) {
                grid[point.getY()][point.getX()] = "P" + counter;
                counter++;
            }

        } else {
            for (Point point : points) {
                grid[point.getY()][point.getX()] = "P";
            }
        }


        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("C  ");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    double distanceFromCenter() {
        this.point = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return this.point;
    }

    double distanceOtherPoint(Point point) {
        double otherPointX = this.x - point.getX();
        double otherPointY = this.y - point.getY();
        otherPoint = Math.sqrt(Math.pow(otherPointX, 2) + Math.pow(otherPointY, 2));
        return otherPoint;
    }

    public Point clone() {
        return new Point(this.x, this.y); // shallow copy, deep copy
    }

    public void move(int moveX, int moveY) {
        this.x += moveX;
        this.y += moveY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
