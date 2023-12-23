package models;

public class Point {
    public double x;
    public double y;

    public double distance(Point dest){
        return Math.sqrt((dest.x-x)*(dest.x-x)+(dest.y-y)*(dest.y-y));
    }
}