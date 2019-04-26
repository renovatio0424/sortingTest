import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortPoint {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        points.add(new Point(3, 2));
        points.add(new Point(2, 4));
        points.add(new Point(1, 5));
        points.add(new Point(3, 3));
        points.add(new Point(1, 7));
        points.add(new Point(4, 1));

        Collections.sort(points);

        for (Point p : points)
            System.out.println("index: " + points.indexOf(p) + " x: " + p.x + " y: " + p.y);

        System.out.println("===========Comparable===========");

        MyComparator myComparator = new MyComparator();
        Collections.sort(points, myComparator);

        for (Point p : points)
            System.out.println("index: " + points.indexOf(p) + " x: " + p.x + " y: " + p.y);

        System.out.println("===========Comparator===========");
    }

}

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if (this.x > point.x)
            return 1;
        else if (this.x == point.x)
            if (this.y < point.y)
                return 1;
        return -1;
    }
}

class MyComparator implements Comparator<Point> {

    @Override
    public int compare(Point point1, Point point2) {
        if (point1.x < point2.x)
            return 1;
        else if (point1.x == point2.x)
            if (point1.y > point2.y)
                return 1;
        return -1;
    }
}
