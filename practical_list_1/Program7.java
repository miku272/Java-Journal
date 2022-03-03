/*
Write a program to create interface 'Area'. Create three classes called 'Rectangle', 'Triangle' and 'Square' and calculate their areas respectively.
*/

interface Area {
    void calcArea();
}

class Rectangle implements Area {
    private int length, breadth;

    Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public void calcArea() {
        System.out.println("The area of rectangle is: " + (length * breadth) + " m^2");
    }
}

class Triangle implements Area {
    private int breadth, height;

    Triangle() {
        this.breadth = 1;
        this.height = 1;
    }

    Triangle(int b, int h) {
        this.breadth = b;
        this.height = h;
    }

    @Override
    public void calcArea() {
        System.out.println("The area of tringle is: " + ((breadth * height) / 2) + " m^2");
    }
}

class Square implements Area {
    private int length;

    Square() {
        this.length = 1;
    }

    Square(int l) {
        this.length = l;
    }

    @Override
    public void calcArea() {
        System.out.println("The area of square is: " + (length * length) + " m^2");
    }
}

public class Program7 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(17, 23);
        Triangle t = new Triangle(16, 45);
        Square s = new Square(46);

        r.calcArea();
        t.calcArea();
        s.calcArea();
    }
}
