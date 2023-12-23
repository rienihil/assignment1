package models;

import java.util.ArrayList;
public class Shape {

    public ArrayList<Point> points = new ArrayList<Point>();
    public void addPoint(Point point){
        points.add(point);
    }

    public double calculatePerimeter(ArrayList<Point> points){
        double sum=0;
        for (int i=0; i<points.size()-1;i++){
            sum+=points.get(i).distance(points.get(i+1));
        }
        return sum;
    }

    public double getAverageSide(ArrayList<Point> points){
        return calculatePerimeter(points)/points.size();
    }

    public double getLongestSide(ArrayList<Point> points){
        double max=0;
        for (int i=0; i<points.size()-1;i++){
            if (max<points.get(i).distance(points.get(i+1))){
                max=points.get(i).distance(points.get(i+1));
            }
        }
        return max;
    }
}