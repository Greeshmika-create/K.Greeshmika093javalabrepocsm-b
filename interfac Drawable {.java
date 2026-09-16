interfac Drawable {
    double PI = 3.14159;
    void draw();
    double area();
    double area();
}
class Circle implements Drawable {
    double r;
    Circle(double r) { this.r = r; }

    @Override
    public void draw() { System.out.println("Drawing circle"); }

    @Override 
    public double area() { return PI * r * r; }
}

interface Resizable { void resize(double factor); }

class Square implements Drawable, Resizable {
    doouble side;
    @Override public void draw()    { System.out.println("Drawing square"); }
    @Override public double area()  { return side * side; }
    @Override public void resize(double f)  { side *= f; }    
}