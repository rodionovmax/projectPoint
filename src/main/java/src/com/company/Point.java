package com.company;

public class Point {

    public static void main(String[] args) {

      Point1 p1 = new Point1();
      p1.x = 4;
      p1.y = 4;

      Point2 p2 = new Point2();
      p2.x = -4;
      p2.y = -4;

      System.out.println("Расстояние между точкой 1 с координатами (" + p1.x + ", " + p1.y +") и точкой 2 " +
              "с координатами (" + p2.x + ", " + p2.y + ") равно " + distance(p1, p2));

    }

    public static double distance (Point1 p1, Point2 p2) {
     double res = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
     return res;
    }
}
