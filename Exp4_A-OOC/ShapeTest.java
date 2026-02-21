import java.util.Scanner;
interface Shape {
    void area();
}
class Rectangle implements Shape {
    int length, breadth;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    public void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}
class Triangle implements Shape {
    int base, height;
    Triangle(int b, int h) {
        base = b;
        height = h;
    }
    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();

        Rectangle r = new Rectangle(l, b);
        r.area();

        System.out.print("Enter base of triangle: ");
        int base = sc.nextInt();

        System.out.print("Enter height of triangle: ");
        int h = sc.nextInt();

        Triangle t = new Triangle(base, h);
        t.area();

        sc.close();
    }
}
