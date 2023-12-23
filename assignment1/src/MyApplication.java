import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/user/IdeaProjects/untitled/src/Source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point();
            point.x=x;
            point.y=y;
            shape.addPoint(point);
        }

        System.out.println(shape.calculatePerimeter(shape.points));
        System.out.println(shape.getAverageSide(shape.points));
        System.out.println(shape.getLongestSide(shape.points));
    }
}