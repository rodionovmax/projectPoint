package com.company;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public static double distance (Point p1, Point p2) {
    return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
  }

  public static void main(String[] args) {

    Point p1 = new Point(4, 3);
    Point p2 = new Point(7, -1);

    System.out.println("Расстояние между точкой 1 с координатами (" + p1.x + ", " + p1.y +") и точкой 2 " +
            "с координатами (" + p1.x + ", " + p2.y + ") равно " + distance(p1, p2));

  }
}
