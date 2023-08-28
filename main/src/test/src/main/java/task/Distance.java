package task;

public class Distance {
    public Distance() {
    }

    public static void main(String[] args) {
        Point p1 = new Point(7.0, 3.0);
        Point p2 = new Point(15.0, 12.0);
        double var10001 = p1.x;
        System.out.println("Расстояние между точками а (" + var10001 + "; " + p1.y + ") и  b (" + p2.x + "; " + p2.y + ") = " + p1.distance(p2));
    }
}

