package capgemini;
class Shape {
    public void area() {
        // base method
    }
}

class Circle extends Shape {
    public void area(double r) {
        System.out.println(3.14 * r * r);
    }
}

class Rectangle extends Shape {
    public void area(int length, int width) {
        System.out.println(length * width);
    }
}

public class exinheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(5);   // pass radius here

        Rectangle r = new Rectangle();
        r.area(4, 5); // pass length & width here
    }
}
