package iuh.fit.se;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20, 10);
        //r.setLength(20);
        //r.setWidth(10);
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());
        System.out.println(r);
    }
}
